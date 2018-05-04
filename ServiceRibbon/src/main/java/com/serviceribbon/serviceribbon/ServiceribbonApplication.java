package com.serviceribbon.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableHystrixDashboard  //加入熔断器监控页面 http://localhost:xxxx/hystrix
@EnableDiscoveryClient  //在工程的启动类中,通过@EnableDiscoveryClient向服务中心注册；
@SpringBootApplication
@EnableHystrix //加入熔断器功能
public class ServiceribbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceribbonApplication.class, args);
	}


	// 并且向程序的ioc注入一个bean: restTemplate;
	// 并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
