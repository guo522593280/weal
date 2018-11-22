package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "eventgame_asia")
public class EventgameAsia {
    /**
     * 赛事ID
     */
    @Column(name = "EVENTGAME_ID")
    private Integer eventgameId;

    /**
     * 主水
     */
    @Column(name = "HWA")
    private Double hwa;

    /**
     * 升降指数 最新发布减上一个发布
     */
    @Column(name = "HWA_LIFT")
    private Double hwaLift;

    /**
     * 客水
     */
    @Column(name = "VWA")
    private Double vwa;

    /**
     * 升降指数 最新发布减上一个发布
     */
    @Column(name = "VWA_LIFT")
    private Double vwaLift;

    /**
     * 盘口
     */
    @Column(name = "DISH")
    private String dish;

    /**
     * 升降指数 1升 0未变 -1降
     */
    @Column(name = "DISH_LIFT")
    private Integer dishLift;

    /**
     * 发布时间
     */
    @Column(name = "RELEASE_DATE")
    private Date releaseDate;

    /**
     * 是否初盘（父码值1023） 1是 2否
     */
    @Column(name = "IS_INITIAL")
    private String isInitial;

    /**
     * 博彩公司Id
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
     * 获取主水
     *
     * @return HWA - 主水
     */
    public Double getHwa() {
        return hwa;
    }

    /**
     * 设置主水
     *
     * @param hwa 主水
     */
    public void setHwa(Double hwa) {
        this.hwa = hwa;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return HWA_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getHwaLift() {
        return hwaLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param hwaLift 升降指数 最新发布减上一个发布
     */
    public void setHwaLift(Double hwaLift) {
        this.hwaLift = hwaLift;
    }

    /**
     * 获取客水
     *
     * @return VWA - 客水
     */
    public Double getVwa() {
        return vwa;
    }

    /**
     * 设置客水
     *
     * @param vwa 客水
     */
    public void setVwa(Double vwa) {
        this.vwa = vwa;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return VWA_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getVwaLift() {
        return vwaLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param vwaLift 升降指数 最新发布减上一个发布
     */
    public void setVwaLift(Double vwaLift) {
        this.vwaLift = vwaLift;
    }

    /**
     * 获取盘口
     *
     * @return DISH - 盘口
     */
    public String getDish() {
        return dish;
    }

    /**
     * 设置盘口
     *
     * @param dish 盘口
     */
    public void setDish(String dish) {
        this.dish = dish == null ? null : dish.trim();
    }

    /**
     * 获取升降指数 1升 0未变 -1降
     *
     * @return DISH_LIFT - 升降指数 1升 0未变 -1降
     */
    public Integer getDishLift() {
        return dishLift;
    }

    /**
     * 设置升降指数 1升 0未变 -1降
     *
     * @param dishLift 升降指数 1升 0未变 -1降
     */
    public void setDishLift(Integer dishLift) {
        this.dishLift = dishLift;
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
     * 获取是否初盘（父码值1023） 1是 2否
     *
     * @return IS_INITIAL - 是否初盘（父码值1023） 1是 2否
     */
    public String getIsInitial() {
        return isInitial;
    }

    /**
     * 设置是否初盘（父码值1023） 1是 2否
     *
     * @param isInitial 是否初盘（父码值1023） 1是 2否
     */
    public void setIsInitial(String isInitial) {
        this.isInitial = isInitial == null ? null : isInitial.trim();
    }

    /**
     * 获取博彩公司Id
     *
     * @return BOOK_ID - 博彩公司Id
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * 设置博彩公司Id
     *
     * @param bookId 博彩公司Id
     */
    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }
}