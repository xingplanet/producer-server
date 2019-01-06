package com.xingplanet.producer.producerserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HelloWorld {


    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/hello")
    public String say(){
        return "aa";
    }
}
