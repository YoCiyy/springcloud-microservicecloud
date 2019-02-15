package com.yoci.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.yoci.springcloud"})
@ComponentScan("com.yoci.springcloud")
public class DeptConsumerFeign8100Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumerFeign8100Application.class, args);
	}
}
