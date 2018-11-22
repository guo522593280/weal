package com.weal.storage.entity;

import javax.persistence.*;

public class League {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 联赛名称
     */
    @Column(name = "LEAGUE_NAME")
    private String leagueName;

    /**
     * 联赛昵称
     */
    @Column(name = "LEAGUE_NICK_NAME")
    private String leagueNickName;

    /**
     * 联赛名称拼音
     */
    @Column(name = "LEAGUE_NAME_PY")
    private String leagueNamePy;

    /**
     * 联赛类型 1热门
     */
    @Column(name = "LEAGUE_TYPE")
    private Integer leagueType;

    /**
     * 颜色标识
     */
    @Column(name = "LEAGUE_COLOR")
    private String leagueColor;

    /**
     * 品牌标志
     */
    @Column(name = "BRAND_URL")
    private String brandUrl;

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
     * 获取联赛名称
     *
     * @return LEAGUE_NAME - 联赛名称
     */
    public String getLeagueName() {
        return leagueName;
    }

    /**
     * 设置联赛名称
     *
     * @param leagueName 联赛名称
     */
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName == null ? null : leagueName.trim();
    }

    /**
     * 获取联赛昵称
     *
     * @return LEAGUE_NICK_NAME - 联赛昵称
     */
    public String getLeagueNickName() {
        return leagueNickName;
    }

    /**
     * 设置联赛昵称
     *
     * @param leagueNickName 联赛昵称
     */
    public void setLeagueNickName(String leagueNickName) {
        this.leagueNickName = leagueNickName == null ? null : leagueNickName.trim();
    }

    /**
     * 获取联赛名称拼音
     *
     * @return LEAGUE_NAME_PY - 联赛名称拼音
     */
    public String getLeagueNamePy() {
        return leagueNamePy;
    }

    /**
     * 设置联赛名称拼音
     *
     * @param leagueNamePy 联赛名称拼音
     */
    public void setLeagueNamePy(String leagueNamePy) {
        this.leagueNamePy = leagueNamePy == null ? null : leagueNamePy.trim();
    }

    /**
     * 获取联赛类型 1热门
     *
     * @return LEAGUE_TYPE - 联赛类型 1热门
     */
    public Integer getLeagueType() {
        return leagueType;
    }

    /**
     * 设置联赛类型 1热门
     *
     * @param leagueType 联赛类型 1热门
     */
    public void setLeagueType(Integer leagueType) {
        this.leagueType = leagueType;
    }

    /**
     * 获取颜色标识
     *
     * @return LEAGUE_COLOR - 颜色标识
     */
    public String getLeagueColor() {
        return leagueColor;
    }

    /**
     * 设置颜色标识
     *
     * @param leagueColor 颜色标识
     */
    public void setLeagueColor(String leagueColor) {
        this.leagueColor = leagueColor == null ? null : leagueColor.trim();
    }

    /**
     * 获取品牌标志
     *
     * @return BRAND_URL - 品牌标志
     */
    public String getBrandUrl() {
        return brandUrl;
    }

    /**
     * 设置品牌标志
     *
     * @param brandUrl 品牌标志
     */
    public void setBrandUrl(String brandUrl) {
        this.brandUrl = brandUrl == null ? null : brandUrl.trim();
    }
}