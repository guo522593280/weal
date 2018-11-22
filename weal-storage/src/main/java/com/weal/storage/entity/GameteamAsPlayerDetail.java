package com.weal.storage.entity;

import javax.persistence.*;

@Table(name = "gameteam_as_player_detail")
public class GameteamAsPlayerDetail {
    /**
     * 赛事ID
     */
    @Column(name = "EVENTGAME_ID")
    private Integer eventgameId;

    /**
     * 球队ID
     */
    @Column(name = "GAMETEAM_ID")
    private Integer gameteamId;

    /**
     * 球员ID
     */
    @Column(name = "PLAYER_ID")
    private Integer playerId;

    /**
     * 换入球员ID
     */
    @Column(name = "IN_PLAYER_ID")
    private Integer inPlayerId;

    /**
     * 明细类型（父码值1007） 1进球 2点球 3乌龙球 4红牌 5黄牌 6两黄一红 7换人 8角球 9任意球
     */
    @Column(name = "DETAIL_TYPE")
    private Integer detailType;

    /**
     * 时间
     */
    @Column(name = "DETAIL_TIME")
    private Integer detailTime;

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
     * 获取球队ID
     *
     * @return GAMETEAM_ID - 球队ID
     */
    public Integer getGameteamId() {
        return gameteamId;
    }

    /**
     * 设置球队ID
     *
     * @param gameteamId 球队ID
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
     * 获取换入球员ID
     *
     * @return IN_PLAYER_ID - 换入球员ID
     */
    public Integer getInPlayerId() {
        return inPlayerId;
    }

    /**
     * 设置换入球员ID
     *
     * @param inPlayerId 换入球员ID
     */
    public void setInPlayerId(Integer inPlayerId) {
        this.inPlayerId = inPlayerId;
    }

    /**
     * 获取明细类型（父码值1007） 1进球 2点球 3乌龙球 4红牌 5黄牌 6两黄一红 7换人 8角球 9任意球
     *
     * @return DETAIL_TYPE - 明细类型（父码值1007） 1进球 2点球 3乌龙球 4红牌 5黄牌 6两黄一红 7换人 8角球 9任意球
     */
    public Integer getDetailType() {
        return detailType;
    }

    /**
     * 设置明细类型（父码值1007） 1进球 2点球 3乌龙球 4红牌 5黄牌 6两黄一红 7换人 8角球 9任意球
     *
     * @param detailType 明细类型（父码值1007） 1进球 2点球 3乌龙球 4红牌 5黄牌 6两黄一红 7换人 8角球 9任意球
     */
    public void setDetailType(Integer detailType) {
        this.detailType = detailType;
    }

    /**
     * 获取时间
     *
     * @return DETAIL_TIME - 时间
     */
    public Integer getDetailTime() {
        return detailTime;
    }

    /**
     * 设置时间
     *
     * @param detailTime 时间
     */
    public void setDetailTime(Integer detailTime) {
        this.detailTime = detailTime;
    }
}