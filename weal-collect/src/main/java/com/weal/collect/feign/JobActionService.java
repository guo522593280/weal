package com.weal.collect.feign;

import com.weal.storage.entity.JobInfo;
import com.xxl.job.core.biz.model.ReturnT;
import feign.Headers;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestBody;

public interface JobActionService {

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /jobinfo/add")
    ReturnT jobInfoAdd(@RequestBody JobInfo jobInfo);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /jobinfo/update")
    ReturnT jobInfoUpdate(@RequestBody JobInfo jobInfo);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /jobinfo/pause")
    ReturnT jobInfoPause(@RequestBody Integer id);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /jobinfo/resume")
    ReturnT jobInfoResume(@RequestBody Integer id);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /jobinfo/remove")
    ReturnT jobInfoRemove(@RequestBody Integer id);

}
