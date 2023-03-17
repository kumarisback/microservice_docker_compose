package com.arun.demo.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "demo2", url="http://localhost:8082/")
public interface Openfeignexample {
	 @RequestMapping(method = RequestMethod.GET, value = "/open-feign")
	    String getval();
}