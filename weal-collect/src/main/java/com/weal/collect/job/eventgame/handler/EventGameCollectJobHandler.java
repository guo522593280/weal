package com.weal.collect.job.eventgame.handler;

import com.weal.collect.common.PageVo;
import com.weal.collect.config.properties.CollectProperties;
import com.weal.collect.feign.FeignClient;
import com.weal.collect.job.eventgame.service.EventGameService;
import com.xuxueli.crawler.XxlCrawler;
import com.xuxueli.crawler.parser.PageParser;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.nodes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @program: 
 * @description:
 * @author: guogc
 * @create: 2018-11-5 09:48
 **/
@JobHandler(value = "eventGameCollectJobHandler")
@Component
@Slf4j
@Async("myExecutor")
public class EventGameCollectJobHandler extends IJobHandler {

    @Autowired
    private EventGameService eventGameService;
    @Autowired
    private FeignClient feignClient;
    @Autowired
    private CollectProperties collectProperties;

    private static final String LOGSTR = " [eventGameCollectJobHandler] =====================================>> ";

    @Override
    public ReturnT<String> execute(String msg) throws Exception {
        try {
            log.info( "[eventGameCollectJobHandler] =====================================>> 数据采集   开始");
            //appCollectService.startEurekaAppsCollect();
            //String returnt= feignClient.getWealCollectService("2018-11-21");
            XxlCrawler crawler = new XxlCrawler.Builder()
            	    .setUrls(collectProperties.getWan500().getWealUrl())
            	    .setParamMap((Map<String, String>) new HashMap().put("e", "2018-11-22"))
            	    .setWhiteUrlRegexs()
            	    .setIfPost(false)
            	    .setTimeoutMillis(10000)
            	    .setPauseMillis(60)
            	    .setThreadCount(3)
            	    .setPageParser(new PageParser<PageVo>() {
            	        @Override
            	        public void parse(Document html, Element pageVoElement, PageVo pageVo) {
            	            // 解析封装 PageVo 对象
            	            String pageUrl = html.baseUri();
            	            System.out.println(pageUrl + "：" + pageVo.toString());
            	        }
            	    })
            	    .build();
            crawler.start(true);
            //System.out.println(returnt);
            log.info(LOGSTR + "注册中心数据采集   结束");
            XxlJobLogger.log(LOGSTR + "注册中心数据采集   结束");
        } catch (Exception e) {
            XxlJobLogger.log(e);
            log.error(LOGSTR + "注册中心数据采集时错误，error info[{}]", e);
            return FAIL;
        }
        return SUCCESS;
    }
    
    
    
    /*@Override
	public ReturnT<String> execute(String param) throws Exception {

		// 分片参数
		ShardingUtil.ShardingVO shardingVO = ShardingUtil.getShardingVo();
		XxlJobLogger.log("分片参数：当前分片序号 = {}, 总分片数 = {}", shardingVO.getIndex(), shardingVO.getTotal());

		// 业务逻辑
		for (int i = 0; i < shardingVO.getTotal(); i++) {
			if (i == shardingVO.getIndex()) {
				XxlJobLogger.log("第 {} 片, 命中分片开始处理", i);
			} else {
				XxlJobLogger.log("第 {} 片, 忽略", i);
			}
		}

		return SUCCESS;
	}*/
    
}
