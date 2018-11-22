package com.weal.collect.feign;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.xxl.job.core.biz.model.ReturnT;

import feign.Headers;
import feign.RequestLine;

/**
 * @author guogchao
 * @date 2018年11月20日 下午2:32:13
 * 
 */
public interface WealCollectService {
	
	@Headers({"Content-Type: multipart/form-data", "Accept: application/xhtml+xml"})
    @RequestLine("GET /wanchang.php")
    ReturnT collectWeal(@RequestParam("e") String e);

}
