package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

public class Eventgame {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 单场编号
     */
    @Column(name = "ONE_NUMBER")
    private String oneNumber;

    /**
     * 赛事日期
     */
    @Column(name = "EVENT_DATE")
    private Date eventDate;

    /**
     * 赛事星期
     */
    @Column(name = "EVENT_WEEK")
    private Integer eventWeek;

    /**
     * 赛事编号
     */
    @Column(name = "EVENT_NO")
    private String eventNo;

    /**
     * 赛事开始时间
     */
    @Column(name = "START_DATETIME")
    private Date startDatetime;

    /**
     * 天气情况
     */
    @Column(name = "WEATHER")
    private String weather;

    /**
     * 温度
     */
    @Column(name = "TEMPERATURE")
    private String temperature;

    /**
     * 联赛ID
     */
    @Column(name = "LEAGUE_ID")
    private Integer leagueId;

    /**
     * 主队ID
     */
    @Column(name = "HTEAM_ID")
    private Integer hteamId;

    /**
     * 主队赛事ID
     */
    @Column(name = "HGAMETEAM_ID")
    private Integer hgameteamId;

    /**
     * 客队ID
     */
    @Column(name = "VTEAM_ID")
    private Integer vteamId;

    /**
     * 客队赛事ID
     */
    @Column(name = "VGAMETEAM_ID")
    private Integer vgameteamId;

    /**
     * 半场
     */
    @Column(name = "HALF")
    private String half;

    /**
     * 全场
     */
    @Column(name = "FULL")
    private String full;

    /**
     * 半全场
     */
    @Column(name = "HALF_FULL")
    private String halfFull;

    /**
     * 总球数
     */
    @Column(name = "TOTALBALL")
    private Integer totalball;

    /**
     * 胜平负  3主胜 1平 0负
     */
    @Column(name = "WINORLOSE")
    private Integer winorlose;

    /**
     * 让球
     */
    @Column(name = "LET_BALL")
    private Integer letBall;

    /**
     * 让球胜负  3主胜 1平 0负
     */
    @Column(name = "LETTHEBALL_WINORLOSE")
    private Integer lettheballWinorlose;

    /**
     * 大小球  3d大 1走 0小
     */
    @Column(name = "SIZE_WINORLOSE")
    private Integer sizeWinorlose;

    /**
     * 盘口输赢 3赢 1走 0输
     */
    @Column(name = "DISH_WINORLOSE")
    private Integer dishWinorlose;

    /**
     * 赛事状态 0未开始 1进行中 2已结束 3待定 4取消 5改期 6腰斩
     */
    @Column(name = "EVENT_STATE")
    private Integer eventState;

    /**
     * 赛事热门单关 1热门 2单关
     */
    @Column(name = "EVENT_SIGN")
    private Integer eventSign;

    /**
     * 赛事类型 0普通 1竞彩 2足球单场
     */
    @Column(name = "EVENT_TYPE")
    private Integer eventType;

    /**
     * 视频链接
     */
    @Column(name = "VIDEOLINK")
    private String videolink;

    /**
     * 动画链接
     */
    @Column(name = "ANIMATIONLINK")
    private String animationlink;

    /**
     * 创建日期
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 修改日期
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

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
     * 获取单场编号
     *
     * @return ONE_NUMBER - 单场编号
     */
    public String getOneNumber() {
        return oneNumber;
    }

    /**
     * 设置单场编号
     *
     * @param oneNumber 单场编号
     */
    public void setOneNumber(String oneNumber) {
        this.oneNumber = oneNumber == null ? null : oneNumber.trim();
    }

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
     * 获取赛事星期
     *
     * @return EVENT_WEEK - 赛事星期
     */
    public Integer getEventWeek() {
        return eventWeek;
    }

    /**
     * 设置赛事星期
     *
     * @param eventWeek 赛事星期
     */
    public void setEventWeek(Integer eventWeek) {
        this.eventWeek = eventWeek;
    }

    /**
     * 获取赛事编号
     *
     * @return EVENT_NO - 赛事编号
     */
    public String getEventNo() {
        return eventNo;
    }

    /**
     * 设置赛事编号
     *
     * @param eventNo 赛事编号
     */
    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
    }

    /**
     * 获取赛事开始时间
     *
     * @return START_DATETIME - 赛事开始时间
     */
    public Date getStartDatetime() {
        return startDatetime;
    }

    /**
     * 设置赛事开始时间
     *
     * @param startDatetime 赛事开始时间
     */
    public void setStartDatetime(Date startDatetime) {
        this.startDatetime = startDatetime;
    }

    /**
     * 获取天气情况
     *
     * @return WEATHER - 天气情况
     */
    public String getWeather() {
        return weather;
    }

    /**
     * 设置天气情况
     *
     * @param weather 天气情况
     */
    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    /**
     * 获取温度
     *
     * @return TEMPERATURE - 温度
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * 设置温度
     *
     * @param temperature 温度
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
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
     * 获取主队ID
     *
     * @return HTEAM_ID - 主队ID
     */
    public Integer getHteamId() {
        return hteamId;
    }

    /**
     * 设置主队ID
     *
     * @param hteamId 主队ID
     */
    public void setHteamId(Integer hteamId) {
        this.hteamId = hteamId;
    }

    /**
     * 获取主队赛事ID
     *
     * @return HGAMETEAM_ID - 主队赛事ID
     */
    public Integer getHgameteamId() {
        return hgameteamId;
    }

    /**
     * 设置主队赛事ID
     *
     * @param hgameteamId 主队赛事ID
     */
    public void setHgameteamId(Integer hgameteamId) {
        this.hgameteamId = hgameteamId;
    }

    /**
     * 获取客队ID
     *
     * @return VTEAM_ID - 客队ID
     */
    public Integer getVteamId() {
        return vteamId;
    }

    /**
     * 设置客队ID
     *
     * @param vteamId 客队ID
     */
    public void setVteamId(Integer vteamId) {
        this.vteamId = vteamId;
    }

    /**
     * 获取客队赛事ID
     *
     * @return VGAMETEAM_ID - 客队赛事ID
     */
    public Integer getVgameteamId() {
        return vgameteamId;
    }

    /**
     * 设置客队赛事ID
     *
     * @param vgameteamId 客队赛事ID
     */
    public void setVgameteamId(Integer vgameteamId) {
        this.vgameteamId = vgameteamId;
    }

    /**
     * 获取半场
     *
     * @return HALF - 半场
     */
    public String getHalf() {
        return half;
    }

    /**
     * 设置半场
     *
     * @param half 半场
     */
    public void setHalf(String half) {
        this.half = half == null ? null : half.trim();
    }

    /**
     * 获取全场
     *
     * @return FULL - 全场
     */
    public String getFull() {
        return full;
    }

    /**
     * 设置全场
     *
     * @param full 全场
     */
    public void setFull(String full) {
        this.full = full == null ? null : full.trim();
    }

    /**
     * 获取半全场
     *
     * @return HALF_FULL - 半全场
     */
    public String getHalfFull() {
        return halfFull;
    }

    /**
     * 设置半全场
     *
     * @param halfFull 半全场
     */
    public void setHalfFull(String halfFull) {
        this.halfFull = halfFull == null ? null : halfFull.trim();
    }

    /**
     * 获取总球数
     *
     * @return TOTALBALL - 总球数
     */
    public Integer getTotalball() {
        return totalball;
    }

    /**
     * 设置总球数
     *
     * @param totalball 总球数
     */
    public void setTotalball(Integer totalball) {
        this.totalball = totalball;
    }

    /**
     * 获取胜平负  3主胜 1平 0负
     *
     * @return WINORLOSE - 胜平负  3主胜 1平 0负
     */
    public Integer getWinorlose() {
        return winorlose;
    }

    /**
     * 设置胜平负  3主胜 1平 0负
     *
     * @param winorlose 胜平负  3主胜 1平 0负
     */
    public void setWinorlose(Integer winorlose) {
        this.winorlose = winorlose;
    }

    /**
     * 获取让球
     *
     * @return LET_BALL - 让球
     */
    public Integer getLetBall() {
        return letBall;
    }

    /**
     * 设置让球
     *
     * @param letBall 让球
     */
    public void setLetBall(Integer letBall) {
        this.letBall = letBall;
    }

    /**
     * 获取让球胜负  3主胜 1平 0负
     *
     * @return LETTHEBALL_WINORLOSE - 让球胜负  3主胜 1平 0负
     */
    public Integer getLettheballWinorlose() {
        return lettheballWinorlose;
    }

    /**
     * 设置让球胜负  3主胜 1平 0负
     *
     * @param lettheballWinorlose 让球胜负  3主胜 1平 0负
     */
    public void setLettheballWinorlose(Integer lettheballWinorlose) {
        this.lettheballWinorlose = lettheballWinorlose;
    }

    /**
     * 获取大小球  3d大 1走 0小
     *
     * @return SIZE_WINORLOSE - 大小球  3d大 1走 0小
     */
    public Integer getSizeWinorlose() {
        return sizeWinorlose;
    }

    /**
     * 设置大小球  3d大 1走 0小
     *
     * @param sizeWinorlose 大小球  3d大 1走 0小
     */
    public void setSizeWinorlose(Integer sizeWinorlose) {
        this.sizeWinorlose = sizeWinorlose;
    }

    /**
     * 获取盘口输赢 3赢 1走 0输
     *
     * @return DISH_WINORLOSE - 盘口输赢 3赢 1走 0输
     */
    public Integer getDishWinorlose() {
        return dishWinorlose;
    }

    /**
     * 设置盘口输赢 3赢 1走 0输
     *
     * @param dishWinorlose 盘口输赢 3赢 1走 0输
     */
    public void setDishWinorlose(Integer dishWinorlose) {
        this.dishWinorlose = dishWinorlose;
    }

    /**
     * 获取赛事状态 0未开始 1进行中 2已结束 3待定 4取消 5改期 6腰斩
     *
     * @return EVENT_STATE - 赛事状态 0未开始 1进行中 2已结束 3待定 4取消 5改期 6腰斩
     */
    public Integer getEventState() {
        return eventState;
    }

    /**
     * 设置赛事状态 0未开始 1进行中 2已结束 3待定 4取消 5改期 6腰斩
     *
     * @param eventState 赛事状态 0未开始 1进行中 2已结束 3待定 4取消 5改期 6腰斩
     */
    public void setEventState(Integer eventState) {
        this.eventState = eventState;
    }

    /**
     * 获取赛事热门单关 1热门 2单关
     *
     * @return EVENT_SIGN - 赛事热门单关 1热门 2单关
     */
    public Integer getEventSign() {
        return eventSign;
    }

    /**
     * 设置赛事热门单关 1热门 2单关
     *
     * @param eventSign 赛事热门单关 1热门 2单关
     */
    public void setEventSign(Integer eventSign) {
        this.eventSign = eventSign;
    }

    /**
     * 获取赛事类型 0普通 1竞彩 2足球单场
     *
     * @return EVENT_TYPE - 赛事类型 0普通 1竞彩 2足球单场
     */
    public Integer getEventType() {
        return eventType;
    }

    /**
     * 设置赛事类型 0普通 1竞彩 2足球单场
     *
     * @param eventType 赛事类型 0普通 1竞彩 2足球单场
     */
    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    /**
     * 获取视频链接
     *
     * @return VIDEOLINK - 视频链接
     */
    public String getVideolink() {
        return videolink;
    }

    /**
     * 设置视频链接
     *
     * @param videolink 视频链接
     */
    public void setVideolink(String videolink) {
        this.videolink = videolink == null ? null : videolink.trim();
    }

    /**
     * 获取动画链接
     *
     * @return ANIMATIONLINK - 动画链接
     */
    public String getAnimationlink() {
        return animationlink;
    }

    /**
     * 设置动画链接
     *
     * @param animationlink 动画链接
     */
    public void setAnimationlink(String animationlink) {
        this.animationlink = animationlink == null ? null : animationlink.trim();
    }

    /**
     * 获取创建日期
     *
     * @return CREATE_TIME - 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建日期
     *
     * @param createTime 创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改日期
     *
     * @return UPDATE_TIME - 修改日期
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改日期
     *
     * @param updateTime 修改日期
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}