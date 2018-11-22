package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "schedule_job")
public class ScheduleJob {
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 任务组
     */
    @Column(name = "JOB_GROUP")
    private String jobGroup;

    /**
     * 任务名
     */
    @Column(name = "JOB_NAME")
    private String jobName;

    /**
     * 任务表达式
     */
    @Column(name = "JOB_CONFIG")
    private String jobConfig;

    /**
     * beanId
     */
    @Column(name = "SPRING_ID")
    private String springId;

    /**
     * 类名
     */
    @Column(name = "CLASS_NAME")
    private String className;

    /**
     * 方法名
     */
    @Column(name = "METHOD_NAME")
    private String methodName;

    /**
     * 任务状态
     */
    @Column(name = "JOB_STATUS")
    private String jobStatus;

    /**
     * 任务是否有状态
     */
    @Column(name = "IS_CONCURRENT")
    private String isConcurrent;

    /**
     * 描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 排序
     */
    @Column(name = "ORDER_BY")
    private Integer orderBy;

    /**
     * 修改时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

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
     * 获取任务表达式
     *
     * @return JOB_CONFIG - 任务表达式
     */
    public String getJobConfig() {
        return jobConfig;
    }

    /**
     * 设置任务表达式
     *
     * @param jobConfig 任务表达式
     */
    public void setJobConfig(String jobConfig) {
        this.jobConfig = jobConfig == null ? null : jobConfig.trim();
    }

    /**
     * 获取beanId
     *
     * @return SPRING_ID - beanId
     */
    public String getSpringId() {
        return springId;
    }

    /**
     * 设置beanId
     *
     * @param springId beanId
     */
    public void setSpringId(String springId) {
        this.springId = springId == null ? null : springId.trim();
    }

    /**
     * 获取类名
     *
     * @return CLASS_NAME - 类名
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置类名
     *
     * @param className 类名
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * 获取方法名
     *
     * @return METHOD_NAME - 方法名
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * 设置方法名
     *
     * @param methodName 方法名
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    /**
     * 获取任务状态
     *
     * @return JOB_STATUS - 任务状态
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * 设置任务状态
     *
     * @param jobStatus 任务状态
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus == null ? null : jobStatus.trim();
    }

    /**
     * 获取任务是否有状态
     *
     * @return IS_CONCURRENT - 任务是否有状态
     */
    public String getIsConcurrent() {
        return isConcurrent;
    }

    /**
     * 设置任务是否有状态
     *
     * @param isConcurrent 任务是否有状态
     */
    public void setIsConcurrent(String isConcurrent) {
        this.isConcurrent = isConcurrent == null ? null : isConcurrent.trim();
    }

    /**
     * 获取描述
     *
     * @return DESCRIPTION - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取排序
     *
     * @return ORDER_BY - 排序
     */
    public Integer getOrderBy() {
        return orderBy;
    }

    /**
     * 设置排序
     *
     * @param orderBy 排序
     */
    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 获取修改时间
     *
     * @return UPDATE_TIME - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}