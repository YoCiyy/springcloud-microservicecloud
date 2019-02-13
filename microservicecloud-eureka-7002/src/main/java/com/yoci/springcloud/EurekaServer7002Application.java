package com.yoci.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka7002集群启动类
 *
 * @author Y.yang
 */
@SpringBootApplication
// @EnableEurekaServer服务器端启动类,接受其它微服务注册进来
@EnableEurekaServer
public class EurekaServer7002Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002Application.class, args);
    }

}
