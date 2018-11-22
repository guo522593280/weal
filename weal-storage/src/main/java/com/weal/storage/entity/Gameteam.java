package com.weal.storage.entity;

import javax.persistence.*;

public class Gameteam {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 球队ID
     */
    @Column(name = "TEAM_ID")
    private Integer teamId;

    /**
     * 球队阵型
     */
    @Column(name = "TEAM_MODEL")
    private String teamModel;

    /**
     * 进球
     */
    @Column(name = "IN_BALL")
    private Integer inBall;

    /**
     * 进攻次数
     */
    @Column(name = "ATTACK")
    private Integer attack;

    /**
     * 危险进攻
     */
    @Column(name = "DANGEROUS")
    private Integer dangerous;

    /**
     * 射门
     */
    @Column(name = "SHOOT")
    private Integer shoot;

    /**
     * 射正
     */
    @Column(name = "ONTARGET")
    private Integer ontarget;

    /**
     * 任意球
     */
    @Column(name = "FREEKICK")
    private Integer freekick;

    /**
     * 角球
     */
    @Column(name = "CORNER")
    private Integer corner;

    /**
     * 越位
     */
    @Column(name = "OFFSIDE")
    private Integer offside;

    /**
     * 犯规
     */
    @Column(name = "FOUL")
    private Integer foul;

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
     * 控球率
     */
    @Column(name = "POSSESSION")
    private Double possession;

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
     * 获取球队ID
     *
     * @return TEAM_ID - 球队ID
     */
    public Integer getTeamId() {
        return teamId;
    }

    /**
     * 设置球队ID
     *
     * @param teamId 球队ID
     */
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    /**
     * 获取球队阵型
     *
     * @return TEAM_MODEL - 球队阵型
     */
    public String getTeamModel() {
        return teamModel;
    }

    /**
     * 设置球队阵型
     *
     * @param teamModel 球队阵型
     */
    public void setTeamModel(String teamModel) {
        this.teamModel = teamModel == null ? null : teamModel.trim();
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
     * 获取进攻次数
     *
     * @return ATTACK - 进攻次数
     */
    public Integer getAttack() {
        return attack;
    }

    /**
     * 设置进攻次数
     *
     * @param attack 进攻次数
     */
    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    /**
     * 获取危险进攻
     *
     * @return DANGEROUS - 危险进攻
     */
    public Integer getDangerous() {
        return dangerous;
    }

    /**
     * 设置危险进攻
     *
     * @param dangerous 危险进攻
     */
    public void setDangerous(Integer dangerous) {
        this.dangerous = dangerous;
    }

    /**
     * 获取射门
     *
     * @return SHOOT - 射门
     */
    public Integer getShoot() {
        return shoot;
    }

    /**
     * 设置射门
     *
     * @param shoot 射门
     */
    public void setShoot(Integer shoot) {
        this.shoot = shoot;
    }

    /**
     * 获取射正
     *
     * @return ONTARGET - 射正
     */
    public Integer getOntarget() {
        return ontarget;
    }

    /**
     * 设置射正
     *
     * @param ontarget 射正
     */
    public void setOntarget(Integer ontarget) {
        this.ontarget = ontarget;
    }

    /**
     * 获取任意球
     *
     * @return FREEKICK - 任意球
     */
    public Integer getFreekick() {
        return freekick;
    }

    /**
     * 设置任意球
     *
     * @param freekick 任意球
     */
    public void setFreekick(Integer freekick) {
        this.freekick = freekick;
    }

    /**
     * 获取角球
     *
     * @return CORNER - 角球
     */
    public Integer getCorner() {
        return corner;
    }

    /**
     * 设置角球
     *
     * @param corner 角球
     */
    public void setCorner(Integer corner) {
        this.corner = corner;
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
     * 获取控球率
     *
     * @return POSSESSION - 控球率
     */
    public Double getPossession() {
        return possession;
    }

    /**
     * 设置控球率
     *
     * @param possession 控球率
     */
    public void setPossession(Double possession) {
        this.possession = possession;
    }
}