package com.weal.storage.entity;

import javax.persistence.*;

public class Team {
    /**
     * 主键ID（外部Id）
     */
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 球队名称
     */
    @Column(name = "TEAM_NAME")
    private String teamName;

    /**
     * 球队昵称
     */
    @Column(name = "TEAM_NICK_NAME")
    private String teamNickName;

    /**
     * 球队名称拼音
     */
    @Column(name = "TEAM_NAME_PY")
    private String teamNamePy;

    /**
     * 球队链接
     */
    @Column(name = "TEAM_LINK")
    private String teamLink;

    /**
     * 成立时间
     */
    @Column(name = "SETUP_TIME")
    private String setupTime;

    /**
     * 国家地区
     */
    @Column(name = "COUNTRIES_AREA")
    private String countriesArea;

    /**
     * 所在城市
     */
    @Column(name = "CITY")
    private String city;

    /**
     * 球队身价
     */
    @Column(name = "TEAM_WORTH")
    private String teamWorth;

    /**
     * 排名
     */
    @Column(name = "RANKING")
    private Integer ranking;

    /**
     * 积分
     */
    @Column(name = "SCORE")
    private Integer score;

    /**
     * 获取主键ID（外部Id）
     *
     * @return PKID - 主键ID（外部Id）
     */
    public Integer getPkid() {
        return pkid;
    }

    /**
     * 设置主键ID（外部Id）
     *
     * @param pkid 主键ID（外部Id）
     */
    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    /**
     * 获取球队名称
     *
     * @return TEAM_NAME - 球队名称
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * 设置球队名称
     *
     * @param teamName 球队名称
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    /**
     * 获取球队昵称
     *
     * @return TEAM_NICK_NAME - 球队昵称
     */
    public String getTeamNickName() {
        return teamNickName;
    }

    /**
     * 设置球队昵称
     *
     * @param teamNickName 球队昵称
     */
    public void setTeamNickName(String teamNickName) {
        this.teamNickName = teamNickName == null ? null : teamNickName.trim();
    }

    /**
     * 获取球队名称拼音
     *
     * @return TEAM_NAME_PY - 球队名称拼音
     */
    public String getTeamNamePy() {
        return teamNamePy;
    }

    /**
     * 设置球队名称拼音
     *
     * @param teamNamePy 球队名称拼音
     */
    public void setTeamNamePy(String teamNamePy) {
        this.teamNamePy = teamNamePy == null ? null : teamNamePy.trim();
    }

    /**
     * 获取球队链接
     *
     * @return TEAM_LINK - 球队链接
     */
    public String getTeamLink() {
        return teamLink;
    }

    /**
     * 设置球队链接
     *
     * @param teamLink 球队链接
     */
    public void setTeamLink(String teamLink) {
        this.teamLink = teamLink == null ? null : teamLink.trim();
    }

    /**
     * 获取成立时间
     *
     * @return SETUP_TIME - 成立时间
     */
    public String getSetupTime() {
        return setupTime;
    }

    /**
     * 设置成立时间
     *
     * @param setupTime 成立时间
     */
    public void setSetupTime(String setupTime) {
        this.setupTime = setupTime == null ? null : setupTime.trim();
    }

    /**
     * 获取国家地区
     *
     * @return COUNTRIES_AREA - 国家地区
     */
    public String getCountriesArea() {
        return countriesArea;
    }

    /**
     * 设置国家地区
     *
     * @param countriesArea 国家地区
     */
    public void setCountriesArea(String countriesArea) {
        this.countriesArea = countriesArea == null ? null : countriesArea.trim();
    }

    /**
     * 获取所在城市
     *
     * @return CITY - 所在城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置所在城市
     *
     * @param city 所在城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取球队身价
     *
     * @return TEAM_WORTH - 球队身价
     */
    public String getTeamWorth() {
        return teamWorth;
    }

    /**
     * 设置球队身价
     *
     * @param teamWorth 球队身价
     */
    public void setTeamWorth(String teamWorth) {
        this.teamWorth = teamWorth == null ? null : teamWorth.trim();
    }

    /**
     * 获取排名
     *
     * @return RANKING - 排名
     */
    public Integer getRanking() {
        return ranking;
    }

    /**
     * 设置排名
     *
     * @param ranking 排名
     */
    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    /**
     * 获取积分
     *
     * @return SCORE - 积分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置积分
     *
     * @param score 积分
     */
    public void setScore(Integer score) {
        this.score = score;
    }
}