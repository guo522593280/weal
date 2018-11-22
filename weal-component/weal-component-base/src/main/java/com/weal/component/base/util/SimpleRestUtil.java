package com.weal.component.base.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;

import java.nio.charset.Charset;

/**
 * @program: boms-control
 * @description:
 * @author: chenshanlin
 * @create: 2018-05-07 18:13
 **/
@Slf4j
public class SimpleRestUtil {

    private static RestTemplate restTemplate = null;

    static {
        StringHttpMessageConverter m = new StringHttpMessageConverter(Charset.forName("GB2312"));
        restTemplate = new RestTemplateBuilder().additionalMessageConverters(m).build();
    }

    public static String postRequest(String url,String requestJson) {
        log.info("请求url：" + url.toString());
        HttpEntity<String> entity = new HttpEntity<String>(requestJson);
        String result = restTemplate.postForObject(url, entity, String.class);
        log.info("接收数据：" + result);
        return result;
    }

    public static String getRequest(String url) {
        log.info("请求url：" + url.toString());
        String result = restTemplate.getForObject(url, String.class);
        log.info("接收数据：" + result);
        return result;
    }

    public static void main(String[] agrs) {
        String data = SimpleRestUtil.postRequest("http://live.500.com/wanchang.php","e=2018-11-21");
        System.out.print(data);
    }
}
