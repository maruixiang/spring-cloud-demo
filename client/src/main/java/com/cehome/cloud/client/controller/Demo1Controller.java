package com.cehome.cloud.equipment.client.controller;

import com.cehome.cloud.equipment.api.Demo1Service;
import com.cehome.cloud.equipment.api.HelloService;
import com.cehome.cloud.equipment.api.HelloService2;
import com.cehome.cloud.equipment.api.MyService;
import com.cehome.cloud.equipment.model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/client")
public class Demo1Controller {

	@Autowired
	private Demo1Service demo1Service;




	@GetMapping("/get")
	public String get() {
		return demo1Service.get();


	}




}