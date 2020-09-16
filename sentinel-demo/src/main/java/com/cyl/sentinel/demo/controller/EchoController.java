package com.cyl.sentinel.demo.controller;

import com.cyl.sentinel.demo.feign.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo-feign/{name}")
    public String echo(@PathVariable String name) {
        return echoService.echo(name);
    }
}
