package com.cyl.nacos.gateway.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosGatewayDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosGatewayDemoApplication.class, args);
    }

}
