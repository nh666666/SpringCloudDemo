package com.aublen.cloud.feignconsumer.controller;

import com.aublen.cloud.feignconsumer.service.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {

    @Autowired
    private DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }

    @GetMapping("/add")
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
