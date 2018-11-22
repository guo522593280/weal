package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

public class Referrer {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 推荐名字
     */
    @Column(name = "REFERRER_NAME")
    private String referrerName;

    /**
     * 名称拼音
     */
    @Column(name = "REFERRER_NAME_PY")
    private String referrerNamePy;

    /**
     * 推荐人积分
     */
    @Column(name = "POINT")
    private Integer point;

    /**
     * 来源
     */
    @Column(name = "HAVELOCAL")
    private String havelocal;

    /**
     * 是否有效 1有效 2无效
     */
    @Column(name = "IS_VALID")
    private Integer isValid;

    /**
     * 修改日期
     */
    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    /**
     * 创建人USER_ID
     */
    @Column(name = "CREATE_BY")
    private Integer createBy;

    /**
     * 创建日期
     */
    @Column(name = "CREARE_DATE")
    private Date creareDate;

    /**
     * 备注
     */
    @Column(name = "REMARKS")
    private String remarks;

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
     * 获取推荐名字
     *
     * @return REFERRER_NAME - 推荐名字
     */
    public String getReferrerName() {
        return referrerName;
    }

    /**
     * 设置推荐名字
     *
     * @param referrerName 推荐名字
     */
    public void setReferrerName(String referrerName) {
        this.referrerName = referrerName == null ? null : referrerName.trim();
    }

    /**
     * 获取名称拼音
     *
     * @return REFERRER_NAME_PY - 名称拼音
     */
    public String getReferrerNamePy() {
        return referrerNamePy;
    }

    /**
     * 设置名称拼音
     *
     * @param referrerNamePy 名称拼音
     */
    public void setReferrerNamePy(String referrerNamePy) {
        this.referrerNamePy = referrerNamePy == null ? null : referrerNamePy.trim();
    }

    /**
     * 获取推荐人积分
     *
     * @return POINT - 推荐人积分
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * 设置推荐人积分
     *
     * @param point 推荐人积分
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * 获取来源
     *
     * @return HAVELOCAL - 来源
     */
    public String getHavelocal() {
        return havelocal;
    }

    /**
     * 设置来源
     *
     * @param havelocal 来源
     */
    public void setHavelocal(String havelocal) {
        this.havelocal = havelocal == null ? null : havelocal.trim();
    }

    /**
     * 获取是否有效 1有效 2无效
     *
     * @return IS_VALID - 是否有效 1有效 2无效
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * 设置是否有效 1有效 2无效
     *
     * @param isValid 是否有效 1有效 2无效
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
     * 获取修改日期
     *
     * @return UPDATE_DATE - 修改日期
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置修改日期
     *
     * @param updateDate 修改日期
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取创建人USER_ID
     *
     * @return CREATE_BY - 创建人USER_ID
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人USER_ID
     *
     * @param createBy 创建人USER_ID
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建日期
     *
     * @return CREARE_DATE - 创建日期
     */
    public Date getCreareDate() {
        return creareDate;
    }

    /**
     * 设置创建日期
     *
     * @param creareDate 创建日期
     */
    public void setCreareDate(Date creareDate) {
        this.creareDate = creareDate;
    }

    /**
     * 获取备注
     *
     * @return REMARKS - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}