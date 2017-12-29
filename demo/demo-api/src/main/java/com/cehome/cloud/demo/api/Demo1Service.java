package com.cehome.cloud.equipment.api;

import com.cehome.cloud.equipment.model.Equipment;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= DemoAPI.SERVICE_ID  )
@RequestMapping("/demo1")
public interface Demo1Service {

    @RequestMapping("/get")
    String get();


}