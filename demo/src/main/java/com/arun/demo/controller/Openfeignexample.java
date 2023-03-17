package com.arun.demo.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//for local development
//@FeignClient(value = "demo2", url="http://localhost:8082/")
//using microserveice name 
@FeignClient(value = "demo2")
public interface Openfeignexample {
	 @RequestMapping(method = RequestMethod.GET, value = "/open-feign")
	    String getval();
}
