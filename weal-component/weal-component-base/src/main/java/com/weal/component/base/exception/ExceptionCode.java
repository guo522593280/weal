package com.weal.component.base.exception;

import com.weal.component.base.common.BaseMassageCode;
import com.weal.component.base.common.StateEnum;

/**
 * @author guogchao
 * @date 2018年9月26日 下午6:24:13
 * 
 */
public enum ExceptionCode implements BaseMassageCode{


    //系统相关 start
    SYSTEM_BUSY(StateEnum.ERROR,-1, "系统繁忙，请稍候再试"),
    SYSTEM_TIMEOUT(StateEnum.ERROR,-2, "系统超时，请稍候再试");

    private int code;
    private StateEnum state;
    private String msg;

    ExceptionCode(StateEnum state,int code, String msg) {
    	this.state=state;
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }

	@Override
	public String getState() {
		return this.state.getState();
	}
}
