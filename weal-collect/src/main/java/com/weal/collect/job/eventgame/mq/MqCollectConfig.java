package com.weal.collect.job.eventgame.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: gguoc
 * @create: 2018-11-5 11:43
 **/

@Configuration
public class MqCollectConfig {

    @Bean
    public Queue EventgameCollectQueue() {
        return new Queue(CommonConstant.EVENTGAME_COLLECT);
    }

    @Bean
    public Queue EventgameCleanQueue() {
        return new Queue(CommonConstant.EVENTGAME_CLEAN);
    }

    @Bean
    public Queue EventgameInstallQueue() {
        return new Queue(CommonConstant.EVENTGAME_INSTALL);
    }

}
