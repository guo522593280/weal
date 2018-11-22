package com.weal.component.base.response;

import java.io.Serializable;

import com.weal.component.base.common.BaseMassageCode;
import com.weal.component.base.common.StateEnum;

import lombok.Data;


@Data
public class DataResponse<T>  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static int SUCCESS=200;
	
    private String message;
	private String state;
	private int code;
    private T data;

    private DataResponse() {
    }

    private DataResponse(String state, int code, String message,T data) {
		this.code = code;
		this.message = message;
		this.state = state;
		this.data = data;
	}

    private DataResponse(BaseMassageCode exceptionCode) {
		this.code = exceptionCode.getCode();
		this.message = exceptionCode.getMsg();
		this.state =exceptionCode.getState();
	}

	/**
	 * 返回成功
	 * 
	 * @author 郭广超
	 */
	public static <T> DataResponse<T> success() {
		return success(null);
	}

	/**
	 * 返回成功
	 * 
	 * @author 郭广超
	 */
	public static <T> DataResponse<T> success(T result) {
		return new DataResponse<>(StateEnum.SUCCESS.getState(), SUCCESS, null, result);
	}


	/**
	 * 返回消息
	 * 
	 * @author 郭广超
	 */
	public static <T> DataResponse<T> info(BaseMassageCode exceptionCode) {
		return info(exceptionCode, null);
	}

	/**
	 * 返回消息
	 * 
	 * @author 郭广超
	 */
	public static <T> DataResponse<T> info(BaseMassageCode exceptionCode, T result) {
		return new DataResponse<>(StateEnum.INFO.getState(), exceptionCode.getCode(), exceptionCode.getMsg(), result);
	}

	/**
	 * 返回失败
	 * 
	 * @author 郭广超
	 */
	public static <T> DataResponse<T> error(BaseMassageCode exceptionCode) {
		return error(exceptionCode, null);
	}

	/**
	 * 返回失败
	 * 
	 * @author 郭广超
	 */
	public static <T> DataResponse<T> error(BaseMassageCode exceptionCode, T result) {
		return new DataResponse<>(StateEnum.ERROR.getState(), exceptionCode.getCode(), exceptionCode.getMsg(), result);
	}

	/**
	 * 返回警告
	 * 
	 * @author 郭广超
	 */
	public static <T> DataResponse<T> warn(BaseMassageCode exceptionCode) {
		return new DataResponse<>(StateEnum.WARN.getState(), exceptionCode.getCode(), exceptionCode.getMsg(), null);
	}
	

	/**
	 * 返回警告
	 * 
	 * @author 郭广超
	 */
	public static <T> DataResponse<T> warn(BaseMassageCode exceptionCode, T result) {
		return new DataResponse<>(StateEnum.WARN.getState(), exceptionCode.getCode(), exceptionCode.getMsg(), result);
	}

}
