package com.weal.storage.entity;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Document(indexName = "eventgameu",type = "library")
@AllArgsConstructor
@NoArgsConstructor
public class EventgameEu {
	
	@Id
	private String id;
	
    /**
     * 赛事ID
     */
    private Integer eventgameId;

    /**
     * 胜
     */
    private Double win;

    /**
     * 升降指数 最新发布减上一个发布
     */
    private Double winLift;

    /**
     * 平
     */
    private Double flat;

    /**
     * 升降指数 最新发布减上一个发布
     */
    private Double flatLift;

    /**
     * 负
     */
    private Double negative;

    /**
     * 升降指数 最新发布减上一个发布
     */
    private Double negativeLift;

    /**
     * 让球
     */
    private Integer letBall;

    /**
     * 发布时间
     */
    private Date releaseDate;

    /**
     * 凯利胜
     */
    private Double kellyWin;

    /**
     * 升降指数 最新发布减上一个发布
     */
    private Double kellyWinLift;

    /**
     * 凯利平
     */
    private Double kellyFlat;

    /**
     * 升降指数 最新发布减上一个发布
     */
    private Double kellyFlatLift;

    /**
     * 凯利负
     */
    private Double kellyNegative;

    /**
     * 升降指数 最新发布减上一个发布
     */
    private Double kellyNegativeLift;

    /**
     * 返还率
     */
    private Double rateofReturn;

    /**
     * 升降指数 最新发布减上一个发布
     */
    private Double rateofReturnLift;

    /**
     * 概率胜
     */
    private Double proWin;

    /**
     * 升降指数 最新发布减上一个发布
     */
    private Double proWinLift;

    /**
     * 概率平
     */
    private Double proFlat;

    /**
     * 升降指数 最新发布减上一个发布
     */
    private Double proFlatLift;

    /**
     * 概率负
     */
    private Double proNegative;

    /**
     * 升降指数 最新发布减上一个发布
     */
    private Double proNegativeLift;

    /**
     * 是否初盘 1是 2否
     */
    private Integer isInitial;

    /**
     * 博彩公司Id
     */
    private Integer bookmakersId;
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
     * 获取胜
     *
     * @return WIN - 胜
     */
    public Double getWin() {
        return win;
    }

    /**
     * 设置胜
     *
     * @param win 胜
     */
    public void setWin(Double win) {
        this.win = win;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return WIN_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getWinLift() {
        return winLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param winLift 升降指数 最新发布减上一个发布
     */
    public void setWinLift(Double winLift) {
        this.winLift = winLift;
    }

    /**
     * 获取平
     *
     * @return FLAT - 平
     */
    public Double getFlat() {
        return flat;
    }

    /**
     * 设置平
     *
     * @param flat 平
     */
    public void setFlat(Double flat) {
        this.flat = flat;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return FLAT_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getFlatLift() {
        return flatLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param flatLift 升降指数 最新发布减上一个发布
     */
    public void setFlatLift(Double flatLift) {
        this.flatLift = flatLift;
    }

    /**
     * 获取负
     *
     * @return NEGATIVE - 负
     */
    public Double getNegative() {
        return negative;
    }

    /**
     * 设置负
     *
     * @param negative 负
     */
    public void setNegative(Double negative) {
        this.negative = negative;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return NEGATIVE_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getNegativeLift() {
        return negativeLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param negativeLift 升降指数 最新发布减上一个发布
     */
    public void setNegativeLift(Double negativeLift) {
        this.negativeLift = negativeLift;
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
     * 获取凯利胜
     *
     * @return KELLY_WIN - 凯利胜
     */
    public Double getKellyWin() {
        return kellyWin;
    }

    /**
     * 设置凯利胜
     *
     * @param kellyWin 凯利胜
     */
    public void setKellyWin(Double kellyWin) {
        this.kellyWin = kellyWin;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return KELLY_WIN_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getKellyWinLift() {
        return kellyWinLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param kellyWinLift 升降指数 最新发布减上一个发布
     */
    public void setKellyWinLift(Double kellyWinLift) {
        this.kellyWinLift = kellyWinLift;
    }

    /**
     * 获取凯利平
     *
     * @return KELLY_FLAT - 凯利平
     */
    public Double getKellyFlat() {
        return kellyFlat;
    }

    /**
     * 设置凯利平
     *
     * @param kellyFlat 凯利平
     */
    public void setKellyFlat(Double kellyFlat) {
        this.kellyFlat = kellyFlat;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return KELLY_FLAT_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getKellyFlatLift() {
        return kellyFlatLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param kellyFlatLift 升降指数 最新发布减上一个发布
     */
    public void setKellyFlatLift(Double kellyFlatLift) {
        this.kellyFlatLift = kellyFlatLift;
    }

    /**
     * 获取凯利负
     *
     * @return KELLY_NEGATIVE - 凯利负
     */
    public Double getKellyNegative() {
        return kellyNegative;
    }

    /**
     * 设置凯利负
     *
     * @param kellyNegative 凯利负
     */
    public void setKellyNegative(Double kellyNegative) {
        this.kellyNegative = kellyNegative;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return KELLY_NEGATIVE_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getKellyNegativeLift() {
        return kellyNegativeLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param kellyNegativeLift 升降指数 最新发布减上一个发布
     */
    public void setKellyNegativeLift(Double kellyNegativeLift) {
        this.kellyNegativeLift = kellyNegativeLift;
    }

    /**
     * 获取返还率
     *
     * @return RATEOF_RETURN - 返还率
     */
    public Double getRateofReturn() {
        return rateofReturn;
    }

    /**
     * 设置返还率
     *
     * @param rateofReturn 返还率
     */
    public void setRateofReturn(Double rateofReturn) {
        this.rateofReturn = rateofReturn;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return RATEOF_RETURN_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getRateofReturnLift() {
        return rateofReturnLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param rateofReturnLift 升降指数 最新发布减上一个发布
     */
    public void setRateofReturnLift(Double rateofReturnLift) {
        this.rateofReturnLift = rateofReturnLift;
    }

    /**
     * 获取概率胜
     *
     * @return PRO_WIN - 概率胜
     */
    public Double getProWin() {
        return proWin;
    }

    /**
     * 设置概率胜
     *
     * @param proWin 概率胜
     */
    public void setProWin(Double proWin) {
        this.proWin = proWin;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return PRO_WIN_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getProWinLift() {
        return proWinLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param proWinLift 升降指数 最新发布减上一个发布
     */
    public void setProWinLift(Double proWinLift) {
        this.proWinLift = proWinLift;
    }

    /**
     * 获取概率平
     *
     * @return PRO_FLAT - 概率平
     */
    public Double getProFlat() {
        return proFlat;
    }

    /**
     * 设置概率平
     *
     * @param proFlat 概率平
     */
    public void setProFlat(Double proFlat) {
        this.proFlat = proFlat;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return PRO_FLAT_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getProFlatLift() {
        return proFlatLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param proFlatLift 升降指数 最新发布减上一个发布
     */
    public void setProFlatLift(Double proFlatLift) {
        this.proFlatLift = proFlatLift;
    }

    /**
     * 获取概率负
     *
     * @return PRO_NEGATIVE - 概率负
     */
    public Double getProNegative() {
        return proNegative;
    }

    /**
     * 设置概率负
     *
     * @param proNegative 概率负
     */
    public void setProNegative(Double proNegative) {
        this.proNegative = proNegative;
    }

    /**
     * 获取升降指数 最新发布减上一个发布
     *
     * @return PRO_NEGATIVE_LIFT - 升降指数 最新发布减上一个发布
     */
    public Double getProNegativeLift() {
        return proNegativeLift;
    }

    /**
     * 设置升降指数 最新发布减上一个发布
     *
     * @param proNegativeLift 升降指数 最新发布减上一个发布
     */
    public void setProNegativeLift(Double proNegativeLift) {
        this.proNegativeLift = proNegativeLift;
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
     * @return BOOKMAKERS_ID - 博彩公司Id
     */
    public Integer getBookmakersId() {
        return bookmakersId;
    }

    /**
     * 设置博彩公司Id
     *
     * @param bookmakersId 博彩公司Id
     */
    public void setBookmakersId(Integer bookmakersId) {
        this.bookmakersId = bookmakersId;
    }
}