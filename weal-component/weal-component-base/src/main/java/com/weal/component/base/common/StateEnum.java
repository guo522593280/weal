package com.weal.component.base.common;
/**
 * @author guogchao
 * @date 2018年10月26日 下午3:48:04
 * 
 */
public enum StateEnum {
	
	SUCCESS("success"), INFO("info"), WARN("warning"), ERROR("error");
	
	private String state;

	StateEnum(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}
}
