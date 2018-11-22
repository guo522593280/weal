package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "eventgame_size")
public class EventgameSize {
    /**
     * 赛事ID
     */
    @Column(name = "EVENTGAME_ID")
    private Integer eventgameId;

    /**
     * 大
     */
    @Column(name = "BIGWA")
    private Double bigwa;

    /**
     * 升降指数 最新发布减上一个发布
     */
    @Column(name = "BIGWA_LIFT")
    private Double bigwaLift;

    /**
     * 小
     */
    @Column(name = "SMALLWA")
    private Double smallwa;

    /**
     * 升降指数 最新发布减上一个发布
     */
    @Column(name = "SMALLWA_LIFT")
    private Double smallwaLift;

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
     * 是否初盘 1是 2否
     */
    @Column(name = "IS_INITIAL")
    private Integer isInitial;

    /**
     * 博彩公司Id
     */
    @Column(name = "BOOK_ID")
    private Integer bookId;

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
     * 获取大
     *
     * @return BIGWA - 大
     */
    public Double getBigwa() {
        return bigwa;
    }

    /**
     * 设置大
     *
     * @param bigwa 大
     */
    public void setBigwa(Double bigwa) {
        this.bigwa = bigwa;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return BIGWA_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getBigwaLift() {
        return bigwaLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param bigwaLift 升降指数 最新发布减上一个发布
     */
    public void setBigwaLift(Double bigwaLift) {
        this.bigwaLift = bigwaLift;
    }

    /**
     * 获取小
     *
     * @return SMALLWA - 小
     */
    public Double getSmallwa() {
        return smallwa;
    }

    /**
     * 设置小
     *
     * @param smallwa 小
     */
    public void setSmallwa(Double smallwa) {
        this.smallwa = smallwa;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return SMALLWA_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getSmallwaLift() {
        return smallwaLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param smallwaLift 升降指数 最新发布减上一个发布
     */
    public void setSmallwaLift(Double smallwaLift) {
        this.smallwaLift = smallwaLift;
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
     * 获取是否初盘 1是 2否
     *
     * @return IS_INITIAL - 是否初盘 1是 2否
     */
    public Integer getIsInitial() {
        return isInitial;
    }

    /**
     * 设置是否初盘 1是 2否
     *
     * @param isInitial 是否初盘 1是 2否
     */
    public void setIsInitial(Integer isInitial) {
        this.isInitial = isInitial;
    }

    /**
     * 获取博彩公司Id
     *
     * @return BOOK_ID - 博彩公司Id
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * 设置博彩公司Id
     *
     * @param bookId 博彩公司Id
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}