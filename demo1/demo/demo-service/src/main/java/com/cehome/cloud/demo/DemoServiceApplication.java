package com.cehome.cloud.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//-- provider or consumer  service
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.cehome.cloud"})
@ComponentScan("com.cehome.cloud.demo")
public class DemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication springApplication=new SpringApplication(DemoServiceApplication.class);
		springApplication.addInitializers(new ApplicationContextInitializer<ConfigurableApplicationContext>() {
			@Override
			public void initialize(ConfigurableApplicationContext applicationContext) {
				applicationContext.getBeanFactory().registerSingleton("configClientBeanPostProcessor0",
				new BeanFactoryPostProcessor(){

					@Override
					public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
						BeanDefinitionRegistry beanDefinitionRegistry = (DefaultListableBeanFactory) beanFactory;
						String[] names=beanDefinitionRegistry.getBeanDefinitionNames();
						for(String name:names){
							System.out.println("***"+name);
							if(name.startsWith("com.cehome.cloud.demo.api.")){
								BeanDefinition beanDefinition= beanDefinitionRegistry.getBeanDefinition(name);
								if(beanDefinition.getBeanClassName().equals("org.springframework.cloud.netflix.feign.FeignClientFactoryBean"))
								 	beanDefinitionRegistry.removeBeanDefinition(name);
							}
						}
						System.out.println("************"+beanFactory);
					}
				});


			}
		});
		
		springApplication.run(args);

	}


}
