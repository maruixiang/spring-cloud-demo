package com.cehome.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//-- consumer  http://blog.didispace.com/spring-cloud-tips-feign-rpc/
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.cehome.cloud"})
@RestController
@ComponentScan("com.cehome.cloud.client")
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication springApplication=new SpringApplication(ClientApplication.class);
        ConfigurableApplicationContext applicationContext=springApplication.run(args);

    }
}
