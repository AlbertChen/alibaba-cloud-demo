package com.cyl.sentinel.demo.feign;

import org.springframework.web.bind.annotation.PathVariable;

public class EchoServiceFallback implements EchoService {

    private Throwable throwable;

    EchoServiceFallback(Throwable throwable) {
        this.throwable = throwable;
    }

    @Override
    public String echo(String str) {
        return "echo fallback, " + throwable.getMessage();
    }

}
