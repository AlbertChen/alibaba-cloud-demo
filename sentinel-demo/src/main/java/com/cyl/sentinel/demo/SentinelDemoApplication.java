package com.cyl.sentinel.demo;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import com.cyl.sentinel.demo.utils.ExceptionUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@SpringCloudApplication
public class SentinelDemoApplication {

    @Bean
    @SentinelRestTemplate(blockHandler = "handleException", blockHandlerClass = ExceptionUtil.class)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SentinelDemoApplication.class, args);
    }

}
