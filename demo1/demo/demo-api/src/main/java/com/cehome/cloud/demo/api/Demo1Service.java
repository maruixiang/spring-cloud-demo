package com.cehome.cloud.demo.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= DemoAPI.SERVICE_ID  )
public interface Demo1Service {

    @RequestMapping("/demo1/get")
    String get();


}