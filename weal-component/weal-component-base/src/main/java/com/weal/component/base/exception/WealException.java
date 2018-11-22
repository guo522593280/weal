package com.weal.component.base.exception;

import com.weal.component.base.common.BaseMassageCode;

import lombok.Data;

/**
 * @author guogchao
 * @date 2018年9月26日 下午6:24:13
 * 
 */
@Data
public class WealException extends RuntimeException {

    private int code;
    
    private String message;

    public WealException() {
    }


    public WealException(BaseMassageCode exceptionCode) {
        this.code = exceptionCode.getCode();
        this.message = exceptionCode.getMsg();
    }

    public WealException(String message) {
        super(message);
        this.message = message;
    }

    public WealException(int code, String message) {
        this.message = message;
        this.code = code;
    }

    public WealException(String message, Throwable cause) {
        super(message, cause);
    }

    public WealException(Throwable cause) {
        super(cause);
    }

    public WealException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public WealException(BaseMassageCode exceptionCode, Throwable cause) {
        this.code = exceptionCode.getCode();
        this.message = exceptionCode.getMsg();
    }


}
