package com.weal.storage.entity;

import javax.persistence.*;

@Table(name = "gameteam_as_player")
public class GameteamAsPlayer {
    /**
     * 赛事ID
     */
    @Column(name = "EVENTGAME_ID")
    private Integer eventgameId;

    /**
     * 比赛球队ID
     */
    @Column(name = "GAMETEAM_ID")
    private Integer gameteamId;

    /**
     * 球员ID
     */
    @Column(name = "PLAYER_ID")
    private Integer playerId;

    /**
     * 位置 1前锋 2中场 3后卫 4守门员 5替补 6未知
     */
    @Column(name = "LOCATION")
    private Integer location;

    /**
     * 编号
     */
    @Column(name = "SERIAL_NUMBER")
    private Integer serialNumber;

    /**
     * 首发 1首发 2替补
     */
    @Column(name = "START_TYPE")
    private Integer startType;

    /**
     * 进球数
     */
    @Column(name = "GOAL")
    private Integer goal;

    /**
     * 助攻数
     */
    @Column(name = "ASSISTANT")
    private Integer assistant;

    /**
     * 射门数
     */
    @Column(name = "SHOOT")
    private Integer shoot;

    /**
     * 传球
     */
    @Column(name = "PASSTHE_BALL")
    private Integer passtheBall;

    /**
     * 抢断
     */
    @Column(name = "STEALS")
    private Integer steals;

    /**
     * 犯规
     */
    @Column(name = "FOUL")
    private Integer foul;

    /**
     * 被犯
     */
    @Column(name = "COVER_FOUL")
    private Integer coverFoul;

    /**
     * 越位
     */
    @Column(name = "OFFSIDE")
    private Integer offside;

    /**
     * 解围
     */
    @Column(name = "CLEARANCE")
    private Integer clearance;

    /**
     * 红牌数
     */
    @Column(name = "RED_CARD")
    private Integer redCard;

    /**
     * 黄牌数
     */
    @Column(name = "YELLOW_CARD")
    private Integer yellowCard;

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
     * 获取比赛球队ID
     *
     * @return GAMETEAM_ID - 比赛球队ID
     */
    public Integer getGameteamId() {
        return gameteamId;
    }

    /**
     * 设置比赛球队ID
     *
     * @param gameteamId 比赛球队ID
     */
    public void setGameteamId(Integer gameteamId) {
        this.gameteamId = gameteamId;
    }

    /**
     * 获取球员ID
     *
     * @return PLAYER_ID - 球员ID
     */
    public Integer getPlayerId() {
        return playerId;
    }

    /**
     * 设置球员ID
     *
     * @param playerId 球员ID
     */
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    /**
     * 获取位置 1前锋 2中场 3后卫 4守门员 5替补 6未知
     *
     * @return LOCATION - 位置 1前锋 2中场 3后卫 4守门员 5替补 6未知
     */
    public Integer getLocation() {
        return location;
    }

    /**
     * 设置位置 1前锋 2中场 3后卫 4守门员 5替补 6未知
     *
     * @param location 位置 1前锋 2中场 3后卫 4守门员 5替补 6未知
     */
    public void setLocation(Integer location) {
        this.location = location;
    }

    /**
     * 获取编号
     *
     * @return SERIAL_NUMBER - 编号
     */
    public Integer getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置编号
     *
     * @param serialNumber 编号
     */
    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * 获取首发 1首发 2替补
     *
     * @return START_TYPE - 首发 1首发 2替补
     */
    public Integer getStartType() {
        return startType;
    }

    /**
     * 设置首发 1首发 2替补
     *
     * @param startType 首发 1首发 2替补
     */
    public void setStartType(Integer startType) {
        this.startType = startType;
    }

    /**
     * 获取进球数
     *
     * @return GOAL - 进球数
     */
    public Integer getGoal() {
        return goal;
    }

    /**
     * 设置进球数
     *
     * @param goal 进球数
     */
    public void setGoal(Integer goal) {
        this.goal = goal;
    }

    /**
     * 获取助攻数
     *
     * @return ASSISTANT - 助攻数
     */
    public Integer getAssistant() {
        return assistant;
    }

    /**
     * 设置助攻数
     *
     * @param assistant 助攻数
     */
    public void setAssistant(Integer assistant) {
        this.assistant = assistant;
    }

    /**
     * 获取射门数
     *
     * @return SHOOT - 射门数
     */
    public Integer getShoot() {
        return shoot;
    }

    /**
     * 设置射门数
     *
     * @param shoot 射门数
     */
    public void setShoot(Integer shoot) {
        this.shoot = shoot;
    }

    /**
     * 获取传球
     *
     * @return PASSTHE_BALL - 传球
     */
    public Integer getPasstheBall() {
        return passtheBall;
    }

    /**
     * 设置传球
     *
     * @param passtheBall 传球
     */
    public void setPasstheBall(Integer passtheBall) {
        this.passtheBall = passtheBall;
    }

    /**
     * 获取抢断
     *
     * @return STEALS - 抢断
     */
    public Integer getSteals() {
        return steals;
    }

    /**
     * 设置抢断
     *
     * @param steals 抢断
     */
    public void setSteals(Integer steals) {
        this.steals = steals;
    }

    /**
     * 获取犯规
     *
     * @return FOUL - 犯规
     */
    public Integer getFoul() {
        return foul;
    }

    /**
     * 设置犯规
     *
     * @param foul 犯规
     */
    public void setFoul(Integer foul) {
        this.foul = foul;
    }

    /**
     * 获取被犯
     *
     * @return COVER_FOUL - 被犯
     */
    public Integer getCoverFoul() {
        return coverFoul;
    }

    /**
     * 设置被犯
     *
     * @param coverFoul 被犯
     */
    public void setCoverFoul(Integer coverFoul) {
        this.coverFoul = coverFoul;
    }

    /**
     * 获取越位
     *
     * @return OFFSIDE - 越位
     */
    public Integer getOffside() {
        return offside;
    }

    /**
     * 设置越位
     *
     * @param offside 越位
     */
    public void setOffside(Integer offside) {
        this.offside = offside;
    }

    /**
     * 获取解围
     *
     * @return CLEARANCE - 解围
     */
    public Integer getClearance() {
        return clearance;
    }

    /**
     * 设置解围
     *
     * @param clearance 解围
     */
    public void setClearance(Integer clearance) {
        this.clearance = clearance;
    }

    /**
     * 获取红牌数
     *
     * @return RED_CARD - 红牌数
     */
    public Integer getRedCard() {
        return redCard;
    }

    /**
     * 设置红牌数
     *
     * @param redCard 红牌数
     */
    public void setRedCard(Integer redCard) {
        this.redCard = redCard;
    }

    /**
     * 获取黄牌数
     *
     * @return YELLOW_CARD - 黄牌数
     */
    public Integer getYellowCard() {
        return yellowCard;
    }

    /**
     * 设置黄牌数
     *
     * @param yellowCard 黄牌数
     */
    public void setYellowCard(Integer yellowCard) {
        this.yellowCard = yellowCard;
    }
}