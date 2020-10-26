package com.aublen.cloud.feignconsumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
