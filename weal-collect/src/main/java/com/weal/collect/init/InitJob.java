package com.weal.collect.init;

import com.weal.collect.feign.FeignClient;
import com.weal.collect.feign.JobActionService;
import com.weal.storage.entity.JobInfo;
import com.weal.storage.repository.JobInfoMapper;
import com.xxl.job.core.biz.model.ReturnT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @program: boms-parent
 * @description:
 * @author: chenshanlin
 * @create: 2018-08-08 16:15
 **/
@Component
@Slf4j
public class InitJob implements CommandLineRunner {
    @Autowired
    private JobInfoMapper jobInfoMapper;
    @Autowired
    private FeignClient feignClient;

    @Override
    public void run(String... args) throws Exception {
        List<JobInfo> jobInfos = jobInfoMapper.selectAll();
        for (JobInfo jobInfo : jobInfos) {
            //如果没有初始化job,则初始化job
            if (jobInfo.getInit() != JobInitEnum.YES.getInit()) {
                jobInfo = addJob(jobInfo);
                jobInfoMapper.updateByPrimaryKeySelective(jobInfo);
            }
        }
    }

    private JobInfo addJob(JobInfo jobInfo) {
        JobActionService jobActionService = feignClient.getJobActionService();
        try {
            ReturnT returnT = jobActionService.jobInfoAdd(jobInfo);
            if (isSucsess(returnT)) {
                jobInfo.setInit(JobInitEnum.YES.getInit());
                log.debug("初始化job成功,jobInfo ID [{}]", jobInfo.getPkid());
            } else {
                jobInfo.setInit(JobInitEnum.ERROR.getInit());
                log.error("初始化job失败,jobInfo ID [{}]", jobInfo.getPkid());
            }
        } catch (Exception e) {
            jobInfo.setInit(JobInitEnum.ERROR.getInit());
            log.error("初始化job异常,异常信息[{}]", e);
        }
        jobInfo.setUpdateTime(new Date());
        return jobInfo;
    }

    private boolean isSucsess(ReturnT returnT) {
        if (returnT.getCode() != 200) {
            log.error("初始化job失败，错误信息[{}]", returnT.getMsg());
            return false;
        }
        return true;
    }
}
