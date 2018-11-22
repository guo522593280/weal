package com.weal.storage.entity;

import javax.persistence.*;

@Table(name = "betting14field_details")
public class Betting14fieldDetails {
    /**
     * 足彩14场Id
     */
    @Column(name = "BETTING14FIELD_ID")
    private Integer betting14fieldId;

    /**
     * 编号
     */
    @Column(name = "SERIAL_NO")
    private String serialNo;

    /**
     * 赛事Id
     */
    @Column(name = "EVENTGAME_ID")
    private Integer eventgameId;

    /**
     * 获取足彩14场Id
     *
     * @return BETTING14FIELD_ID - 足彩14场Id
     */
    public Integer getBetting14fieldId() {
        return betting14fieldId;
    }

    /**
     * 设置足彩14场Id
     *
     * @param betting14fieldId 足彩14场Id
     */
    public void setBetting14fieldId(Integer betting14fieldId) {
        this.betting14fieldId = betting14fieldId;
    }

    /**
     * 获取编号
     *
     * @return SERIAL_NO - 编号
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * 设置编号
     *
     * @param serialNo 编号
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    /**
     * 获取赛事Id
     *
     * @return EVENTGAME_ID - 赛事Id
     */
    public Integer getEventgameId() {
        return eventgameId;
    }

    /**
     * 设置赛事Id
     *
     * @param eventgameId 赛事Id
     */
    public void setEventgameId(Integer eventgameId) {
        this.eventgameId = eventgameId;
    }
}