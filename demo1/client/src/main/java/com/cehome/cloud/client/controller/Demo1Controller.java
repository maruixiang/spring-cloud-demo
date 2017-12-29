package com.cehome.cloud.client.controller;

import com.cehome.cloud.demo.api.Demo1Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo1")
public class Demo1Controller {
	private static final Logger logger = LoggerFactory.getLogger(Demo1Controller.class);

	@Autowired
	private Demo1Service demo1Service;

	@GetMapping("/get")
	public String get() {
		logger.info("begin to get ......");
		return demo1Service.get();

	}
}