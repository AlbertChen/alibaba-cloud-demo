package com.cyl.nacos.config.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${user.name}")
    private String userName;

    @Value("${user.age}")
    private Integer userAge;

    @GetMapping("/get")
    public Map<String, Object> getConfig() {
        Map<String, Object> configMap = new HashMap();
        configMap.put("userName", userName);
        configMap.put("userAge", userAge);
        return configMap;
    }

}
