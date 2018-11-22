package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "schedule_job_log")
public class ScheduleJobLog {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 任务Id
     */
    @Column(name = "SCHEDULE_JOB_ID")
    private Integer scheduleJobId;

    /**
     * 任务名
     */
    @Column(name = "JOB_NAME")
    private String jobName;

    /**
     * 任务组
     */
    @Column(name = "JOB_GROUP")
    private String jobGroup;

    /**
     * 状态
     */
    @Column(name = "STATE")
    private String state;

    /**
     * 创建日期
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 任务明细
     */
    @Column(name = "LOG_INFO")
    private String logInfo;

    /**
     * 获取主键ID
     *
     * @return PKID - 主键ID
     */
    public Integer getPkid() {
        return pkid;
    }

    /**
     * 设置主键ID
     *
     * @param pkid 主键ID
     */
    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    /**
     * 获取任务Id
     *
     * @return SCHEDULE_JOB_ID - 任务Id
     */
    public Integer getScheduleJobId() {
        return scheduleJobId;
    }

    /**
     * 设置任务Id
     *
     * @param scheduleJobId 任务Id
     */
    public void setScheduleJobId(Integer scheduleJobId) {
        this.scheduleJobId = scheduleJobId;
    }

    /**
     * 获取任务名
     *
     * @return JOB_NAME - 任务名
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 设置任务名
     *
     * @param jobName 任务名
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * 获取任务组
     *
     * @return JOB_GROUP - 任务组
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * 设置任务组
     *
     * @param jobGroup 任务组
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup == null ? null : jobGroup.trim();
    }

    /**
     * 获取状态
     *
     * @return STATE - 状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 获取创建日期
     *
     * @return CREATE_TIME - 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建日期
     *
     * @param createTime 创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取任务明细
     *
     * @return LOG_INFO - 任务明细
     */
    public String getLogInfo() {
        return logInfo;
    }

    /**
     * 设置任务明细
     *
     * @param logInfo 任务明细
     */
    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo == null ? null : logInfo.trim();
    }
}