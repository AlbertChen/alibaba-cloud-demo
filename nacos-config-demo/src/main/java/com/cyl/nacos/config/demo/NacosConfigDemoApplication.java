package com.cyl.nacos.config.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class NacosConfigDemoApplication {

    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosConfigDemoApplication.class, args);

        while (true) {
            String userName = applicationContext.getEnvironment().getProperty("user.name");
            String userAge = applicationContext.getEnvironment().getProperty("user.age");
//            System.err.println("user name:" + userName + "; age: " + userAge);
            //获取当前部署的环境
            String currentEnv = applicationContext.getEnvironment().getProperty("current.env");
            System.err.println("in " + currentEnv + " enviroment; " + "user name: " + userName + "; age: " + userAge);
            TimeUnit.SECONDS.sleep(1);
        }

    }

}
