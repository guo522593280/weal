package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "access_log")
public class AccessLog {
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    private String action;

    private Long cost;

    private String detail;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    private String module;

    private String object;

    @Column(name = "request_ip")
    private String requestIp;

    @Column(name = "response_ip")
    private String responseIp;

    private String result;

    @Column(name = "tenant_id")
    private Long tenantId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String userName;

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
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return cost;
    }

    /**
     * @param cost
     */
    public void setCost(Long cost) {
        this.cost = cost;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * @return gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return module
     */
    public String getModule() {
        return module;
    }

    /**
     * @param module
     */
    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    /**
     * @return object
     */
    public String getObject() {
        return object;
    }

    /**
     * @param object
     */
    public void setObject(String object) {
        this.object = object == null ? null : object.trim();
    }

    /**
     * @return request_ip
     */
    public String getRequestIp() {
        return requestIp;
    }

    /**
     * @param requestIp
     */
    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp == null ? null : requestIp.trim();
    }

    /**
     * @return response_ip
     */
    public String getResponseIp() {
        return responseIp;
    }

    /**
     * @param responseIp
     */
    public void setResponseIp(String responseIp) {
        this.responseIp = responseIp == null ? null : responseIp.trim();
    }

    /**
     * @return result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * @return tenant_id
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * @param tenantId
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}