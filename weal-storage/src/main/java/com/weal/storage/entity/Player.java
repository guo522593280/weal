package com.weal.storage.entity;

import javax.persistence.*;

public class Player {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 球员名称
     */
    @Column(name = "PLAYER_NAME")
    private String playerName;

    /**
     * 拼音
     */
    @Column(name = "PLAYER_NAME_PY")
    private String playerNamePy;

    /**
     * 球员昵称
     */
    @Column(name = "PLAYER_NICK_NAME")
    private String playerNickName;

    /**
     * 头像
     */
    @Column(name = "HEAD_PORTRAIT")
    private String headPortrait;

    /**
     * 位置 0教练 1前锋 2中场 3后卫 4守门员 5未知
     */
    @Column(name = "LOCATION")
    private Integer location;

    /**
     * 球衣号码
     */
    @Column(name = "CLOTHES_NUMBER")
    private Integer clothesNumber;

    /**
     * 年龄
     */
    @Column(name = "AGE")
    private Integer age;

    /**
     * 身高
     */
    @Column(name = "HEIGHT")
    private Integer height;

    /**
     * 体重
     */
    @Column(name = "WEIGHT")
    private Integer weight;

    /**
     * 国籍
     */
    @Column(name = "NATIONALITY")
    private String nationality;

    /**
     * 出场次数
     */
    @Column(name = "APPEAR_NUMBER")
    private Integer appearNumber;

    /**
     * 出场时间
     */
    @Column(name = "APPEAR_TIME")
    private Integer appearTime;

    /**
     * 进球
     */
    @Column(name = "IN_BALL")
    private Integer inBall;

    /**
     * 助攻
     */
    @Column(name = "ASSISTANT")
    private Integer assistant;

    /**
     * 黄牌
     */
    @Column(name = "YELLOW_CARD")
    private Integer yellowCard;

    /**
     * 红牌
     */
    @Column(name = "RED_CARD")
    private Integer redCard;

    /**
     * 所属团队
     */
    @Column(name = "TEAM_ID")
    private String teamId;

    /**
     * 身价
     */
    @Column(name = "WORTH")
    private String worth;

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
     * 获取球员名称
     *
     * @return PLAYER_NAME - 球员名称
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * 设置球员名称
     *
     * @param playerName 球员名称
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName == null ? null : playerName.trim();
    }

    /**
     * 获取拼音
     *
     * @return PLAYER_NAME_PY - 拼音
     */
    public String getPlayerNamePy() {
        return playerNamePy;
    }

    /**
     * 设置拼音
     *
     * @param playerNamePy 拼音
     */
    public void setPlayerNamePy(String playerNamePy) {
        this.playerNamePy = playerNamePy == null ? null : playerNamePy.trim();
    }

    /**
     * 获取球员昵称
     *
     * @return PLAYER_NICK_NAME - 球员昵称
     */
    public String getPlayerNickName() {
        return playerNickName;
    }

    /**
     * 设置球员昵称
     *
     * @param playerNickName 球员昵称
     */
    public void setPlayerNickName(String playerNickName) {
        this.playerNickName = playerNickName == null ? null : playerNickName.trim();
    }

    /**
     * 获取头像
     *
     * @return HEAD_PORTRAIT - 头像
     */
    public String getHeadPortrait() {
        return headPortrait;
    }

    /**
     * 设置头像
     *
     * @param headPortrait 头像
     */
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    /**
     * 获取位置 0教练 1前锋 2中场 3后卫 4守门员 5未知
     *
     * @return LOCATION - 位置 0教练 1前锋 2中场 3后卫 4守门员 5未知
     */
    public Integer getLocation() {
        return location;
    }

    /**
     * 设置位置 0教练 1前锋 2中场 3后卫 4守门员 5未知
     *
     * @param location 位置 0教练 1前锋 2中场 3后卫 4守门员 5未知
     */
    public void setLocation(Integer location) {
        this.location = location;
    }

    /**
     * 获取球衣号码
     *
     * @return CLOTHES_NUMBER - 球衣号码
     */
    public Integer getClothesNumber() {
        return clothesNumber;
    }

    /**
     * 设置球衣号码
     *
     * @param clothesNumber 球衣号码
     */
    public void setClothesNumber(Integer clothesNumber) {
        this.clothesNumber = clothesNumber;
    }

    /**
     * 获取年龄
     *
     * @return AGE - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取身高
     *
     * @return HEIGHT - 身高
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 设置身高
     *
     * @param height 身高
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 获取体重
     *
     * @return WEIGHT - 体重
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置体重
     *
     * @param weight 体重
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获取国籍
     *
     * @return NATIONALITY - 国籍
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 设置国籍
     *
     * @param nationality 国籍
     */
    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    /**
     * 获取出场次数
     *
     * @return APPEAR_NUMBER - 出场次数
     */
    public Integer getAppearNumber() {
        return appearNumber;
    }

    /**
     * 设置出场次数
     *
     * @param appearNumber 出场次数
     */
    public void setAppearNumber(Integer appearNumber) {
        this.appearNumber = appearNumber;
    }

    /**
     * 获取出场时间
     *
     * @return APPEAR_TIME - 出场时间
     */
    public Integer getAppearTime() {
        return appearTime;
    }

    /**
     * 设置出场时间
     *
     * @param appearTime 出场时间
     */
    public void setAppearTime(Integer appearTime) {
        this.appearTime = appearTime;
    }

    /**
     * 获取进球
     *
     * @return IN_BALL - 进球
     */
    public Integer getInBall() {
        return inBall;
    }

    /**
     * 设置进球
     *
     * @param inBall 进球
     */
    public void setInBall(Integer inBall) {
        this.inBall = inBall;
    }

    /**
     * 获取助攻
     *
     * @return ASSISTANT - 助攻
     */
    public Integer getAssistant() {
        return assistant;
    }

    /**
     * 设置助攻
     *
     * @param assistant 助攻
     */
    public void setAssistant(Integer assistant) {
        this.assistant = assistant;
    }

    /**
     * 获取黄牌
     *
     * @return YELLOW_CARD - 黄牌
     */
    public Integer getYellowCard() {
        return yellowCard;
    }

    /**
     * 设置黄牌
     *
     * @param yellowCard 黄牌
     */
    public void setYellowCard(Integer yellowCard) {
        this.yellowCard = yellowCard;
    }

    /**
     * 获取红牌
     *
     * @return RED_CARD - 红牌
     */
    public Integer getRedCard() {
        return redCard;
    }

    /**
     * 设置红牌
     *
     * @param redCard 红牌
     */
    public void setRedCard(Integer redCard) {
        this.redCard = redCard;
    }

    /**
     * 获取所属团队
     *
     * @return TEAM_ID - 所属团队
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * 设置所属团队
     *
     * @param teamId 所属团队
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    /**
     * 获取身价
     *
     * @return WORTH - 身价
     */
    public String getWorth() {
        return worth;
    }

    /**
     * 设置身价
     *
     * @param worth 身价
     */
    public void setWorth(String worth) {
        this.worth = worth == null ? null : worth.trim();
    }
}