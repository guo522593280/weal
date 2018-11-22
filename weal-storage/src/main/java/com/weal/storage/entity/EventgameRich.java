package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "eventgame_rich")
public class EventgameRich {
    /**
     * 赛事ID
     */
    @Column(name = "EVENTGAME_ID")
    private Integer eventgameId;

    /**
     * 比分，球，半全场类型  2比分 3球 4半全场
     */
    @Column(name = "RICH_TYPE")
    private String richType;

    /**
     * 比分，球，半全场
     */
    @Column(name = "RICH")
    private String rich;

    /**
     * 赔率
     */
    @Column(name = "RATE")
    private Double rate;

    /**
     * 升降指数 最新发布减上一个发布
     */
    @Column(name = "RATE_LIFT")
    private Double rateLift;

    /**
     * 发布时间
     */
    @Column(name = "RELEASE_DATE")
    private Date releaseDate;

    /**
     * 是否初盘 1是 2否
     */
    @Column(name = "IS_INITIAL")
    private String isInitial;

    /**
     * 博彩公司ID
     */
    @Column(name = "BOOK_ID")
    private String bookId;

    /**
     * 获取赛事ID
     *
     * @return EVENTGAME_ID - 赛事ID
     */
    public Integer getEventgameId() {
        return eventgameId;
    }

    /**
     * 设置赛事ID
     *
     * @param eventgameId 赛事ID
     */
    public void setEventgameId(Integer eventgameId) {
        this.eventgameId = eventgameId;
    }

    /**
     * 获取比分，球，半全场类型  2比分 3球 4半全场
     *
     * @return RICH_TYPE - 比分，球，半全场类型  2比分 3球 4半全场
     */
    public String getRichType() {
        return richType;
    }

    /**
     * 设置比分，球，半全场类型  2比分 3球 4半全场
     *
     * @param richType 比分，球，半全场类型  2比分 3球 4半全场
     */
    public void setRichType(String richType) {
        this.richType = richType == null ? null : richType.trim();
    }

    /**
     * 获取比分，球，半全场
     *
     * @return RICH - 比分，球，半全场
     */
    public String getRich() {
        return rich;
    }

    /**
     * 设置比分，球，半全场
     *
     * @param rich 比分，球，半全场
     */
    public void setRich(String rich) {
        this.rich = rich == null ? null : rich.trim();
    }

    /**
     * 获取赔率
     *
     * @return RATE - 赔率
     */
    public Double getRate() {
        return rate;
    }

    /**
     * 设置赔率
     *
     * @param rate 赔率
     */
    public void setRate(Double rate) {
        this.rate = rate;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return RATE_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getRateLift() {
        return rateLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param rateLift 升降指数 最新发布减上一个发布
     */
    public void setRateLift(Double rateLift) {
        this.rateLift = rateLift;
    }

    /**
     * 获取发布时间
     *
     * @return RELEASE_DATE - 发布时间
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * 设置发布时间
     *
     * @param releaseDate 发布时间
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * 获取是否初盘 1是 2否
     *
     * @return IS_INITIAL - 是否初盘 1是 2否
     */
    public String getIsInitial() {
        return isInitial;
    }

    /**
     * 设置是否初盘 1是 2否
     *
     * @param isInitial 是否初盘 1是 2否
     */
    public void setIsInitial(String isInitial) {
        this.isInitial = isInitial == null ? null : isInitial.trim();
    }

    /**
     * 获取博彩公司ID
     *
     * @return BOOK_ID - 博彩公司ID
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * 设置博彩公司ID
     *
     * @param bookId 博彩公司ID
     */
    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }
}