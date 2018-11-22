package com.weal.collect.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weal.collect.job.eventgame.handler.EventGameCollectJobHandler;
import com.weal.component.middle.cache.ICache;
import com.weal.storage.entity.EventgameEu;
import com.weal.storage.repository.EventgameEuRepository;
import com.weal.storage.repository.JobInfoMapper;



/**
 * @program: boms-master
 * @description:
 * @author: chenshanlin
 * @create: 2018-06-22 17:53
 **/
@Controller
public class TestController {

    @Autowired
    JobInfoMapper jobInfoMapper;
    @Autowired
    EventgameEuRepository eventgameEuRepository;
    @Autowired
    ICache iCache;
    @Autowired
    EventGameCollectJobHandler eventGameCollectJobHandler;
    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test(){
        try {
			eventGameCollectJobHandler.execute("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @ResponseBody
    @RequestMapping(value = "/test_mq", method = RequestMethod.GET)
    @Cacheable(cacheNames="book3",  keyGenerator="KeyGenerator")
    public String testMQ(){
        return "发送MQ事件成功，内容为：aaaaaa";
    }

    @ResponseBody
    @RequestMapping(value = "/test_sw", method = RequestMethod.GET)
    public String testSw(){
   /*     ITraceService traceService = scfeignClient.getTraceService();
        TraceParam traceParam = new TraceParam();
        PageQo pageQo = new PageQo();
        pageQo.setPageNum(1);
        pageQo.setPageSize(20);
        traceParam.setPageQo(pageQo);

        StepDto stepDto = new StepDto();
        stepDto.setStartTime("2018-06-25 1006");
        stepDto.setEndTime("2018-06-25 1021");
        stepDto.setStep("MINUTE");
        traceParam.setStepDto(stepDto);

        TraceDto traceDto = new TraceDto();
        traceParam.setTraceDto(traceDto);
        traceService.getTraces(traceParam);*/
        return null;
    }
    @ResponseBody
    @RequestMapping(value = "/test_sc", method = RequestMethod.GET)
    public String testSc(){
    	EventgameEu eu=new EventgameEu();
    	eu.setEventgameId(123);
    	eu.setFlat(4.5);
    	eu.setIsInitial(1);
    	eu.setKellyFlatLift(4.5);
    	eu.setLetBall(4);
    	eu.setNegative(4.4);
    	eventgameEuRepository.save(eu);
        return null;
    }
}
