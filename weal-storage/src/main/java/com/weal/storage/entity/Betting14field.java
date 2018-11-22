package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

public class Betting14field {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 开始时间
     */
    @Column(name = "START_DATE")
    private Date startDate;

    /**
     * 截止时间
     */
    @Column(name = "END_DATE")
    private Date endDate;

    /**
     * 开奖时间
     */
    @Column(name = "LOTTERY_DATE")
    private Date lotteryDate;

    /**
     * 期号
     */
    @Column(name = "ISSUE")
    private String issue;

    /**
     * 状态 0未开始 1进行中 2结束
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 一等奖注数
     */
    @Column(name = "FIRST_PRIZE_NUMBER")
    private Integer firstPrizeNumber;

    /**
     * 一等奖金额
     */
    @Column(name = "FIRST_PRIZE_MONEY")
    private Integer firstPrizeMoney;

    /**
     * 一等奖总金额
     */
    @Column(name = "FIRST_PRIZE_TOTAL")
    private Integer firstPrizeTotal;

    /**
     * 二等奖注数
     */
    @Column(name = "SECOND_PRIZE_NUMBER")
    private Integer secondPrizeNumber;

    /**
     * 二等奖金额
     */
    @Column(name = "SECOND_PRIZE_MONEY")
    private Integer secondPrizeMoney;

    /**
     * 二等奖总金额
     */
    @Column(name = "SECOND_PRIZE_TOTAL")
    private Integer secondPrizeTotal;

    /**
     * 半全场注数
     */
    @Column(name = "HALF_FULL_PRIZE_NUMBER")
    private Integer halfFullPrizeNumber;

    /**
     * 半全场金额
     */
    @Column(name = "HALF_FULL_PRIZE_MONEY")
    private Integer halfFullPrizeMoney;

    /**
     * 半全场总金额
     */
    @Column(name = "HALF_FULL_PRIZE_TOTAL")
    private Integer halfFullPrizeTotal;

    /**
     * 任九注数
     */
    @Column(name = "NINE_PRIZE_NUMBER")
    private Integer ninePrizeNumber;

    /**
     * 任九金额
     */
    @Column(name = "NINE_PRIZE_MONEY")
    private Integer ninePrizeMoney;

    /**
     * 任九总金额
     */
    @Column(name = "NINE_PRIZE_TOTAL")
    private Integer ninePrizeTotal;

    /**
     * 进球注数
     */
    @Column(name = "INBALL_PRIZE_NUMBER")
    private Integer inballPrizeNumber;

    /**
     * 进球金额
     */
    @Column(name = "INBALL_PRIZE_MONEY")
    private Integer inballPrizeMoney;

    /**
     * 进球总金额
     */
    @Column(name = "INBALL_PRIZE_TOTAL")
    private Integer inballPrizeTotal;

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
     * 获取开始时间
     *
     * @return START_DATE - 开始时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始时间
     *
     * @param startDate 开始时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取截止时间
     *
     * @return END_DATE - 截止时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置截止时间
     *
     * @param endDate 截止时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取开奖时间
     *
     * @return LOTTERY_DATE - 开奖时间
     */
    public Date getLotteryDate() {
        return lotteryDate;
    }

    /**
     * 设置开奖时间
     *
     * @param lotteryDate 开奖时间
     */
    public void setLotteryDate(Date lotteryDate) {
        this.lotteryDate = lotteryDate;
    }

    /**
     * 获取期号
     *
     * @return ISSUE - 期号
     */
    public String getIssue() {
        return issue;
    }

    /**
     * 设置期号
     *
     * @param issue 期号
     */
    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    /**
     * 获取状态 0未开始 1进行中 2结束
     *
     * @return STATUS - 状态 0未开始 1进行中 2结束
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0未开始 1进行中 2结束
     *
     * @param status 状态 0未开始 1进行中 2结束
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取一等奖注数
     *
     * @return FIRST_PRIZE_NUMBER - 一等奖注数
     */
    public Integer getFirstPrizeNumber() {
        return firstPrizeNumber;
    }

    /**
     * 设置一等奖注数
     *
     * @param firstPrizeNumber 一等奖注数
     */
    public void setFirstPrizeNumber(Integer firstPrizeNumber) {
        this.firstPrizeNumber = firstPrizeNumber;
    }

    /**
     * 获取一等奖金额
     *
     * @return FIRST_PRIZE_MONEY - 一等奖金额
     */
    public Integer getFirstPrizeMoney() {
        return firstPrizeMoney;
    }

    /**
     * 设置一等奖金额
     *
     * @param firstPrizeMoney 一等奖金额
     */
    public void setFirstPrizeMoney(Integer firstPrizeMoney) {
        this.firstPrizeMoney = firstPrizeMoney;
    }

    /**
     * 获取一等奖总金额
     *
     * @return FIRST_PRIZE_TOTAL - 一等奖总金额
     */
    public Integer getFirstPrizeTotal() {
        return firstPrizeTotal;
    }

    /**
     * 设置一等奖总金额
     *
     * @param firstPrizeTotal 一等奖总金额
     */
    public void setFirstPrizeTotal(Integer firstPrizeTotal) {
        this.firstPrizeTotal = firstPrizeTotal;
    }

    /**
     * 获取二等奖注数
     *
     * @return SECOND_PRIZE_NUMBER - 二等奖注数
     */
    public Integer getSecondPrizeNumber() {
        return secondPrizeNumber;
    }

    /**
     * 设置二等奖注数
     *
     * @param secondPrizeNumber 二等奖注数
     */
    public void setSecondPrizeNumber(Integer secondPrizeNumber) {
        this.secondPrizeNumber = secondPrizeNumber;
    }

    /**
     * 获取二等奖金额
     *
     * @return SECOND_PRIZE_MONEY - 二等奖金额
     */
    public Integer getSecondPrizeMoney() {
        return secondPrizeMoney;
    }

    /**
     * 设置二等奖金额
     *
     * @param secondPrizeMoney 二等奖金额
     */
    public void setSecondPrizeMoney(Integer secondPrizeMoney) {
        this.secondPrizeMoney = secondPrizeMoney;
    }

    /**
     * 获取二等奖总金额
     *
     * @return SECOND_PRIZE_TOTAL - 二等奖总金额
     */
    public Integer getSecondPrizeTotal() {
        return secondPrizeTotal;
    }

    /**
     * 设置二等奖总金额
     *
     * @param secondPrizeTotal 二等奖总金额
     */
    public void setSecondPrizeTotal(Integer secondPrizeTotal) {
        this.secondPrizeTotal = secondPrizeTotal;
    }

    /**
     * 获取半全场注数
     *
     * @return HALF_FULL_PRIZE_NUMBER - 半全场注数
     */
    public Integer getHalfFullPrizeNumber() {
        return halfFullPrizeNumber;
    }

    /**
     * 设置半全场注数
     *
     * @param halfFullPrizeNumber 半全场注数
     */
    public void setHalfFullPrizeNumber(Integer halfFullPrizeNumber) {
        this.halfFullPrizeNumber = halfFullPrizeNumber;
    }

    /**
     * 获取半全场金额
     *
     * @return HALF_FULL_PRIZE_MONEY - 半全场金额
     */
    public Integer getHalfFullPrizeMoney() {
        return halfFullPrizeMoney;
    }

    /**
     * 设置半全场金额
     *
     * @param halfFullPrizeMoney 半全场金额
     */
    public void setHalfFullPrizeMoney(Integer halfFullPrizeMoney) {
        this.halfFullPrizeMoney = halfFullPrizeMoney;
    }

    /**
     * 获取半全场总金额
     *
     * @return HALF_FULL_PRIZE_TOTAL - 半全场总金额
     */
    public Integer getHalfFullPrizeTotal() {
        return halfFullPrizeTotal;
    }

    /**
     * 设置半全场总金额
     *
     * @param halfFullPrizeTotal 半全场总金额
     */
    public void setHalfFullPrizeTotal(Integer halfFullPrizeTotal) {
        this.halfFullPrizeTotal = halfFullPrizeTotal;
    }

    /**
     * 获取任九注数
     *
     * @return NINE_PRIZE_NUMBER - 任九注数
     */
    public Integer getNinePrizeNumber() {
        return ninePrizeNumber;
    }

    /**
     * 设置任九注数
     *
     * @param ninePrizeNumber 任九注数
     */
    public void setNinePrizeNumber(Integer ninePrizeNumber) {
        this.ninePrizeNumber = ninePrizeNumber;
    }

    /**
     * 获取任九金额
     *
     * @return NINE_PRIZE_MONEY - 任九金额
     */
    public Integer getNinePrizeMoney() {
        return ninePrizeMoney;
    }

    /**
     * 设置任九金额
     *
     * @param ninePrizeMoney 任九金额
     */
    public void setNinePrizeMoney(Integer ninePrizeMoney) {
        this.ninePrizeMoney = ninePrizeMoney;
    }

    /**
     * 获取任九总金额
     *
     * @return NINE_PRIZE_TOTAL - 任九总金额
     */
    public Integer getNinePrizeTotal() {
        return ninePrizeTotal;
    }

    /**
     * 设置任九总金额
     *
     * @param ninePrizeTotal 任九总金额
     */
    public void setNinePrizeTotal(Integer ninePrizeTotal) {
        this.ninePrizeTotal = ninePrizeTotal;
    }

    /**
     * 获取进球注数
     *
     * @return INBALL_PRIZE_NUMBER - 进球注数
     */
    public Integer getInballPrizeNumber() {
        return inballPrizeNumber;
    }

    /**
     * 设置进球注数
     *
     * @param inballPrizeNumber 进球注数
     */
    public void setInballPrizeNumber(Integer inballPrizeNumber) {
        this.inballPrizeNumber = inballPrizeNumber;
    }

    /**
     * 获取进球金额
     *
     * @return INBALL_PRIZE_MONEY - 进球金额
     */
    public Integer getInballPrizeMoney() {
        return inballPrizeMoney;
    }

    /**
     * 设置进球金额
     *
     * @param inballPrizeMoney 进球金额
     */
    public void setInballPrizeMoney(Integer inballPrizeMoney) {
        this.inballPrizeMoney = inballPrizeMoney;
    }

    /**
     * 获取进球总金额
     *
     * @return INBALL_PRIZE_TOTAL - 进球总金额
     */
    public Integer getInballPrizeTotal() {
        return inballPrizeTotal;
    }

    /**
     * 设置进球总金额
     *
     * @param inballPrizeTotal 进球总金额
     */
    public void setInballPrizeTotal(Integer inballPrizeTotal) {
        this.inballPrizeTotal = inballPrizeTotal;
    }
}