package com.cehome.cloud.demo.service;

import com.cehome.cloud.demo.api.Demo1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1ServiceImpl implements Demo1Service {

    @Override
    public String get() {
        return "This is Demo1 Service";
    }
}
