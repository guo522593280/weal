package com.weal.collect.init;

/**
 * @author guogchao
 * @date 2018年11月5日 下午4:52:59
 * 
 */
public enum JobInitEnum {

	NO(0,"未初始化"), YES(1,"已经初始化"), ERROR(2,"初始化错误");
	private Integer init;

	JobInitEnum(Integer init,String name) {
		this.init=init;
	}

	public Integer getInit() {
		return this.init;
	}
}
