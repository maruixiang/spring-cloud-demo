package com.cehome.cloud.equipment.service;

import com.cehome.cloud.equipment.api.Demo1Service;
import com.cehome.cloud.equipment.api.MyService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1ServiceImpl implements Demo1Service {


    @Override
    public String get() {
        return "This is Demo1Service";
    }
}
