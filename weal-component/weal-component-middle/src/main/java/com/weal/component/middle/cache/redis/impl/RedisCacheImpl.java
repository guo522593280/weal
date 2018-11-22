package com.weal.component.middle.cache.redis.impl;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import com.weal.component.middle.cache.DistributSyncMethod;
import com.weal.component.middle.cache.ICache;
import com.weal.component.middle.cache.redis.RedisLock;



@Repository
class RedisCacheImpl implements ICache {

	@Resource
	private RedisTemplate<String, Object> redisTemplate;

	public RedisTemplate<String, Object> getRedisTemplate() {
		return redisTemplate;
	}

	public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	public <T>T syncexec(String lockname, DistributSyncMethod method) {
		RedisLock lock = new RedisLock(redisTemplate, lockname, 10000, 20000);
		try {
			if (lock.lock()) {
				return (T) method.execute();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// 为了让分布式锁的算法更稳键些，持有锁的客户端在解锁之前应该再检查一次自己的锁是否已经超时，再去做DEL操作，因为可能客户端因为某个耗时的操作而挂起，
			// 操作完的时候锁因为超时已经被别人获得，这时就不必解锁了。 ————这里没有做
			lock.unlock();
		}
		return null;
	}


	@Override
	public <T> boolean add(String key, T value, Long liveTime) {
		if (redisTemplate != null) {
			if (liveTime != null && liveTime > 0) {
				redisTemplate.opsForValue().set(key, value, liveTime, TimeUnit.SECONDS);
			} else {
				redisTemplate.opsForValue().set(key, value);
			}
			return true;
		}
		return false;
	}

	@Override
	public <T> T get(String key) {
		if (redisTemplate != null) {
			return (T) redisTemplate.opsForValue().get(key);
		}
		return null;
	}

	@Override
	public boolean del(String key) {
		if (redisTemplate != null) {
			redisTemplate.delete(key);
			return true;
		}
		return false;
	}

	@Override
	public <String, T> boolean adds(Map<String, T> map, Long liveTime) {
		if (redisTemplate != null) {
			ValueOperations va=redisTemplate.opsForValue();
			for (String key : map.keySet()) {
				T  value=map.get(key);
				if (liveTime != null && liveTime > 0) {
					va.set(key, value, liveTime, TimeUnit.SECONDS);
				} else {
					va.set(key, value);
				}
			}
			
			return true;
		}
		return false;
	}

	@Override
	public long incr(String key, int l) {
		if (redisTemplate != null) {
			return redisTemplate.boundValueOps(key).increment(l);
		}
		return 0;
	}

	@Override
	public <T> boolean zadd(java.lang.String key, T value, Long liveTime) {
		// TODO Auto-generated method stub
		return false;
	}

}
