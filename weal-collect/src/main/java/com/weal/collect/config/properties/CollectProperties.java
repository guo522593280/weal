package com.weal.collect.config.properties;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * @author guogchao
 * @date 2018年11月20日 下午2:25:20
 * 
 */
@Configuration
@ConfigurationProperties(prefix = "collect")
@Data
public class CollectProperties {
	
	private Wan500 wan500 = new Wan500();
	
	@Data
    public class Wan500 {
        private String wealUrl;
    }

}
