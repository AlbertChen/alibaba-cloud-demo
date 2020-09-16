package com.cyl.sentinel.demo.controller;

import com.cyl.sentinel.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return demoService.sayHello(name);
    }

    @GetMapping(value = "/template")
    public String template() {
        return restTemplate.getForObject("http://www.taobao.com/test", String.class);
    }

}
