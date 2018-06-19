package com.example.client.user.controller;

import com.example.client.user.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("remote")
public class RemoteController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("order")
    public Order remoteOrder(){
        List<ServiceInstance> instances = discoveryClient.getInstances("SERVICE-ORDER");
        String url = instances.get(0).getUri()+"/order/detail";
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        Order order = restTemplate.getForObject(url, Order.class);
        return order;
    }
}
