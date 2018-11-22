package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "referrer_bill")
public class ReferrerBill {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 推荐人ID
     */
    @Column(name = "REFERRER_ID")
    private Integer referrerId;

    /**
     * 推荐类型
     */
    @Column(name = "REFERRER_TYPE")
    private String referrerType;

    /**
     * 购买金额
     */
    @Column(name = "BUY_MONEY")
    private Integer buyMoney;

    /**
     * 是否中奖 0未中 1中奖
     */
    @Column(name = "IS_WIN")
    private Integer isWin;

    /**
     * 一单费用
     */
    @Column(name = "FEE")
    private Integer fee;

    /**
     * 中奖金额
     */
    @Column(name = "WIN_MONEY")
    private Integer winMoney;

    /**
     * 推单日期
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

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
     * 获取推荐人ID
     *
     * @return REFERRER_ID - 推荐人ID
     */
    public Integer getReferrerId() {
        return referrerId;
    }

    /**
     * 设置推荐人ID
     *
     * @param referrerId 推荐人ID
     */
    public void setReferrerId(Integer referrerId) {
        this.referrerId = referrerId;
    }

    /**
     * 获取推荐类型
     *
     * @return REFERRER_TYPE - 推荐类型
     */
    public String getReferrerType() {
        return referrerType;
    }

    /**
     * 设置推荐类型
     *
     * @param referrerType 推荐类型
     */
    public void setReferrerType(String referrerType) {
        this.referrerType = referrerType == null ? null : referrerType.trim();
    }

    /**
     * 获取购买金额
     *
     * @return BUY_MONEY - 购买金额
     */
    public Integer getBuyMoney() {
        return buyMoney;
    }

    /**
     * 设置购买金额
     *
     * @param buyMoney 购买金额
     */
    public void setBuyMoney(Integer buyMoney) {
        this.buyMoney = buyMoney;
    }

    /**
     * 获取是否中奖 0未中 1中奖
     *
     * @return IS_WIN - 是否中奖 0未中 1中奖
     */
    public Integer getIsWin() {
        return isWin;
    }

    /**
     * 设置是否中奖 0未中 1中奖
     *
     * @param isWin 是否中奖 0未中 1中奖
     */
    public void setIsWin(Integer isWin) {
        this.isWin = isWin;
    }

    /**
     * 获取一单费用
     *
     * @return FEE - 一单费用
     */
    public Integer getFee() {
        return fee;
    }

    /**
     * 设置一单费用
     *
     * @param fee 一单费用
     */
    public void setFee(Integer fee) {
        this.fee = fee;
    }

    /**
     * 获取中奖金额
     *
     * @return WIN_MONEY - 中奖金额
     */
    public Integer getWinMoney() {
        return winMoney;
    }

    /**
     * 设置中奖金额
     *
     * @param winMoney 中奖金额
     */
    public void setWinMoney(Integer winMoney) {
        this.winMoney = winMoney;
    }

    /**
     * 获取推单日期
     *
     * @return CREATE_DATE - 推单日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置推单日期
     *
     * @param createDate 推单日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}