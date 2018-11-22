package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "referrer_analyze")
public class ReferrerAnalyze {
    /**
     * 赛事日期
     */
    @Column(name = "EVENT_DATE")
    private Date eventDate;

    /**
     * 推荐人ID
     */
    @Column(name = "REFERRER_ID")
    private Integer referrerId;

    /**
     * 联赛ID
     */
    @Column(name = "LEAGUE_ID")
    private Integer leagueId;

    /**
     * 总推单
     */
    @Column(name = "ZCOUNT")
    private Integer zcount;

    /**
     * 红单总数
     */
    @Column(name = "WIN_COUNT")
    private Integer winCount;

    /**
     * 双选总数
     */
    @Column(name = "DUAL_COUNT")
    private Integer dualCount;

    /**
     * 双选红单总数
     */
    @Column(name = "DUAL_WIN_COUNT")
    private Integer dualWinCount;

    /**
     * 高赔总数
     */
    @Column(name = "GP_COUNT")
    private Integer gpCount;

    /**
     * 高赔红单总数
     */
    @Column(name = "GP_WIN_COUNT")
    private Integer gpWinCount;

    /**
     * 获取赛事日期
     *
     * @return EVENT_DATE - 赛事日期
     */
    public Date getEventDate() {
        return eventDate;
    }

    /**
     * 设置赛事日期
     *
     * @param eventDate 赛事日期
     */
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
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
     * 获取联赛ID
     *
     * @return LEAGUE_ID - 联赛ID
     */
    public Integer getLeagueId() {
        return leagueId;
    }

    /**
     * 设置联赛ID
     *
     * @param leagueId 联赛ID
     */
    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    /**
     * 获取总推单
     *
     * @return ZCOUNT - 总推单
     */
    public Integer getZcount() {
        return zcount;
    }

    /**
     * 设置总推单
     *
     * @param zcount 总推单
     */
    public void setZcount(Integer zcount) {
        this.zcount = zcount;
    }

    /**
     * 获取红单总数
     *
     * @return WIN_COUNT - 红单总数
     */
    public Integer getWinCount() {
        return winCount;
    }

    /**
     * 设置红单总数
     *
     * @param winCount 红单总数
     */
    public void setWinCount(Integer winCount) {
        this.winCount = winCount;
    }

    /**
     * 获取双选总数
     *
     * @return DUAL_COUNT - 双选总数
     */
    public Integer getDualCount() {
        return dualCount;
    }

    /**
     * 设置双选总数
     *
     * @param dualCount 双选总数
     */
    public void setDualCount(Integer dualCount) {
        this.dualCount = dualCount;
    }

    /**
     * 获取双选红单总数
     *
     * @return DUAL_WIN_COUNT - 双选红单总数
     */
    public Integer getDualWinCount() {
        return dualWinCount;
    }

    /**
     * 设置双选红单总数
     *
     * @param dualWinCount 双选红单总数
     */
    public void setDualWinCount(Integer dualWinCount) {
        this.dualWinCount = dualWinCount;
    }

    /**
     * 获取高赔总数
     *
     * @return GP_COUNT - 高赔总数
     */
    public Integer getGpCount() {
        return gpCount;
    }

    /**
     * 设置高赔总数
     *
     * @param gpCount 高赔总数
     */
    public void setGpCount(Integer gpCount) {
        this.gpCount = gpCount;
    }

    /**
     * 获取高赔红单总数
     *
     * @return GP_WIN_COUNT - 高赔红单总数
     */
    public Integer getGpWinCount() {
        return gpWinCount;
    }

    /**
     * 设置高赔红单总数
     *
     * @param gpWinCount 高赔红单总数
     */
    public void setGpWinCount(Integer gpWinCount) {
        this.gpWinCount = gpWinCount;
    }
}