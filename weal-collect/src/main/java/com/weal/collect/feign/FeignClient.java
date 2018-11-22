package com.weal.collect.feign;

import feign.Feign;
import feign.Request.Options;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weal.collect.config.XxlJobConfig;
import com.weal.collect.config.properties.CollectProperties;
import com.weal.component.base.util.SimpleRestUtil;

@Component
public class FeignClient {

    @Autowired
    private XxlJobConfig xxlJobConfig;
    @Autowired
    private CollectProperties collectProperties;


    public JobActionService getJobActionService() {
        JobActionService service = Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .options(new Options(10000, 60000))
                .target(JobActionService.class, xxlJobConfig.getAdminAddresses());
        return service;
    }
    
    public String getWealCollectService(String prm) {
    	return SimpleRestUtil.postRequest(collectProperties.getWan500().getWealUrl(),"e="+prm);
    }
}
