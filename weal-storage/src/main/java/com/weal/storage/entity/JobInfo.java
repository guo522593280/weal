package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "job_info")
public class JobInfo {
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    @Column(name = "add_time")
    private Date addTime;

    @Column(name = "alarm_email")
    private String alarmEmail;

    private String author;

    @Column(name = "child_job_id")
    private String childJobId;

    @Column(name = "executor_block_strategy")
    private String executorBlockStrategy;

    @Column(name = "executor_fail_strategy")
    private String executorFailStrategy;

    @Column(name = "executor_handler")
    private String executorHandler;

    @Column(name = "executor_param")
    private String executorParam;

    @Column(name = "executor_route_strategy")
    private String executorRouteStrategy;

    @Column(name = "glue_remark")
    private String glueRemark;

    @Column(name = "glue_source")
    private String glueSource;

    @Column(name = "glue_type")
    private String glueType;

    @Column(name = "glue_updatetime")
    private Date glueUpdatetime;

    @Column(name = "job_cron")
    private String jobCron;

    @Column(name = "job_desc")
    private String jobDesc;

    @Column(name = "job_group")
    private Integer jobGroup;

    @Column(name = "job_status")
    private String jobStatus;

    @Column(name = "registration_center")
    private String registrationCenter;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "create_time")
    private Date createTime;

    private String creator;

    private String description;

    private String mender;

    private String name;

    private Integer belonged;

    private Integer init;

    /**
     * @return PKID
     */
    public Integer getPkid() {
        return pkid;
    }

    /**
     * @param pkid
     */
    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    /**
     * @return add_time
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * @param addTime
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * @return alarm_email
     */
    public String getAlarmEmail() {
        return alarmEmail;
    }

    /**
     * @param alarmEmail
     */
    public void setAlarmEmail(String alarmEmail) {
        this.alarmEmail = alarmEmail == null ? null : alarmEmail.trim();
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * @return child_job_id
     */
    public String getChildJobId() {
        return childJobId;
    }

    /**
     * @param childJobId
     */
    public void setChildJobId(String childJobId) {
        this.childJobId = childJobId == null ? null : childJobId.trim();
    }

    /**
     * @return executor_block_strategy
     */
    public String getExecutorBlockStrategy() {
        return executorBlockStrategy;
    }

    /**
     * @param executorBlockStrategy
     */
    public void setExecutorBlockStrategy(String executorBlockStrategy) {
        this.executorBlockStrategy = executorBlockStrategy == null ? null : executorBlockStrategy.trim();
    }

    /**
     * @return executor_fail_strategy
     */
    public String getExecutorFailStrategy() {
        return executorFailStrategy;
    }

    /**
     * @param executorFailStrategy
     */
    public void setExecutorFailStrategy(String executorFailStrategy) {
        this.executorFailStrategy = executorFailStrategy == null ? null : executorFailStrategy.trim();
    }

    /**
     * @return executor_handler
     */
    public String getExecutorHandler() {
        return executorHandler;
    }

    /**
     * @param executorHandler
     */
    public void setExecutorHandler(String executorHandler) {
        this.executorHandler = executorHandler == null ? null : executorHandler.trim();
    }

    /**
     * @return executor_param
     */
    public String getExecutorParam() {
        return executorParam;
    }

    /**
     * @param executorParam
     */
    public void setExecutorParam(String executorParam) {
        this.executorParam = executorParam == null ? null : executorParam.trim();
    }

    /**
     * @return executor_route_strategy
     */
    public String getExecutorRouteStrategy() {
        return executorRouteStrategy;
    }

    /**
     * @param executorRouteStrategy
     */
    public void setExecutorRouteStrategy(String executorRouteStrategy) {
        this.executorRouteStrategy = executorRouteStrategy == null ? null : executorRouteStrategy.trim();
    }

    /**
     * @return glue_remark
     */
    public String getGlueRemark() {
        return glueRemark;
    }

    /**
     * @param glueRemark
     */
    public void setGlueRemark(String glueRemark) {
        this.glueRemark = glueRemark == null ? null : glueRemark.trim();
    }

    /**
     * @return glue_source
     */
    public String getGlueSource() {
        return glueSource;
    }

    /**
     * @param glueSource
     */
    public void setGlueSource(String glueSource) {
        this.glueSource = glueSource == null ? null : glueSource.trim();
    }

    /**
     * @return glue_type
     */
    public String getGlueType() {
        return glueType;
    }

    /**
     * @param glueType
     */
    public void setGlueType(String glueType) {
        this.glueType = glueType == null ? null : glueType.trim();
    }

    /**
     * @return glue_updatetime
     */
    public Date getGlueUpdatetime() {
        return glueUpdatetime;
    }

    /**
     * @param glueUpdatetime
     */
    public void setGlueUpdatetime(Date glueUpdatetime) {
        this.glueUpdatetime = glueUpdatetime;
    }

    /**
     * @return job_cron
     */
    public String getJobCron() {
        return jobCron;
    }

    /**
     * @param jobCron
     */
    public void setJobCron(String jobCron) {
        this.jobCron = jobCron == null ? null : jobCron.trim();
    }

    /**
     * @return job_desc
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * @param jobDesc
     */
    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc == null ? null : jobDesc.trim();
    }

    /**
     * @return job_group
     */
    public Integer getJobGroup() {
        return jobGroup;
    }

    /**
     * @param jobGroup
     */
    public void setJobGroup(Integer jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * @return job_status
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * @param jobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus == null ? null : jobStatus.trim();
    }

    /**
     * @return registration_center
     */
    public String getRegistrationCenter() {
        return registrationCenter;
    }

    /**
     * @param registrationCenter
     */
    public void setRegistrationCenter(String registrationCenter) {
        this.registrationCenter = registrationCenter == null ? null : registrationCenter.trim();
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return mender
     */
    public String getMender() {
        return mender;
    }

    /**
     * @param mender
     */
    public void setMender(String mender) {
        this.mender = mender == null ? null : mender.trim();
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return belonged
     */
    public Integer getBelonged() {
        return belonged;
    }

    /**
     * @param belonged
     */
    public void setBelonged(Integer belonged) {
        this.belonged = belonged;
    }

    /**
     * @return init
     */
    public Integer getInit() {
        return init;
    }

    /**
     * @param init
     */
    public void setInit(Integer init) {
        this.init = init;
    }
}