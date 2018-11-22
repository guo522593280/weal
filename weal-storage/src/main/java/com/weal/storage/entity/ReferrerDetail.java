package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "referrer_detail")
public class ReferrerDetail {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 推单ID
     */
    @Column(name = "REFERRER_BILL_ID")
    private Integer referrerBillId;

    /**
     * 赛事ID
     */
    @Column(name = "EVENTGAME_ID")
    private String eventgameId;

    /**
     * 猜单类型 1胜负 2比分 3总进球 4半全场 
     */
    @Column(name = "GUESS_TYPE")
    private Integer guessType;

    /**
     * 猜单
     */
    @Column(name = "GUESS")
    private String guess;

    /**
     * 赔率
     */
    @Column(name = "ODDS")
    private String odds;

    /**
     * 是否红单 0-未红 1-已红
     */
    @Column(name = "IS_WIN")
    private Integer isWin;

    /**
     * 创建日期
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
     * 获取推单ID
     *
     * @return REFERRER_BILL_ID - 推单ID
     */
    public Integer getReferrerBillId() {
        return referrerBillId;
    }

    /**
     * 设置推单ID
     *
     * @param referrerBillId 推单ID
     */
    public void setReferrerBillId(Integer referrerBillId) {
        this.referrerBillId = referrerBillId;
    }

    /**
     * 获取赛事ID
     *
     * @return EVENTGAME_ID - 赛事ID
     */
    public String getEventgameId() {
        return eventgameId;
    }

    /**
     * 设置赛事ID
     *
     * @param eventgameId 赛事ID
     */
    public void setEventgameId(String eventgameId) {
        this.eventgameId = eventgameId == null ? null : eventgameId.trim();
    }

    /**
     * 获取猜单类型 1胜负 2比分 3总进球 4半全场 
     *
     * @return GUESS_TYPE - 猜单类型 1胜负 2比分 3总进球 4半全场 
     */
    public Integer getGuessType() {
        return guessType;
    }

    /**
     * 设置猜单类型 1胜负 2比分 3总进球 4半全场 
     *
     * @param guessType 猜单类型 1胜负 2比分 3总进球 4半全场 
     */
    public void setGuessType(Integer guessType) {
        this.guessType = guessType;
    }

    /**
     * 获取猜单
     *
     * @return GUESS - 猜单
     */
    public String getGuess() {
        return guess;
    }

    /**
     * 设置猜单
     *
     * @param guess 猜单
     */
    public void setGuess(String guess) {
        this.guess = guess == null ? null : guess.trim();
    }

    /**
     * 获取赔率
     *
     * @return ODDS - 赔率
     */
    public String getOdds() {
        return odds;
    }

    /**
     * 设置赔率
     *
     * @param odds 赔率
     */
    public void setOdds(String odds) {
        this.odds = odds == null ? null : odds.trim();
    }

    /**
     * 获取是否红单 0-未红 1-已红
     *
     * @return IS_WIN - 是否红单 0-未红 1-已红
     */
    public Integer getIsWin() {
        return isWin;
    }

    /**
     * 设置是否红单 0-未红 1-已红
     *
     * @param isWin 是否红单 0-未红 1-已红
     */
    public void setIsWin(Integer isWin) {
        this.isWin = isWin;
    }

    /**
     * 获取创建日期
     *
     * @return CREATE_DATE - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}