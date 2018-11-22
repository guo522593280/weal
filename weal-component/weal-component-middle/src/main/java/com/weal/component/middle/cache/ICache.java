package com.weal.component.middle.cache;

import java.util.Map;

/**
 * cache 的操作开放接口
 * @author ggc
 *2017-3-31 下午7:25:42
 */
public interface ICache {
	
	/**
     * 锁定
     * 
     * @param key
     */
	public abstract <T>T syncexec(String lockname, DistributSyncMethod method);
	 
	/**
	 * 添加数据 设置有效时间
	 * @param key
	 * @param value
	 * @param liveTime
	 * @return
	 */
	public abstract <T>boolean add(String key, T value, Long liveTime);
	
	/**
	 * 批量添加 数据
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public abstract <String,T>boolean adds(Map<String,T> map, Long liveTime);
	
	/**
	 * 计数
	 * @param key
	 * @param l   每次加 几
	 * @return
	 */
	 public abstract long incr(String key, int l);
	 
	 
	/**
	 * 根据key获取对象
	 */
	public abstract <T>T get(String key);
	/**
	 * 根据key删除对象
	 */
	public abstract boolean del(String key);
	
	
	/**
	 * 添加数据 设置有效时间
	 * @param key
	 * @param value
	 * @param liveTime
	 * @return
	 */
	public abstract <T>boolean zadd(String key, T value, Long liveTime);
	
	
}