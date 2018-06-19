package com.example.feign.controller;

import com.example.feign.model.Order;
import com.example.feign.remote.RemoteOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class FeignController {
    @Autowired
    private RemoteOrder remoteOrder;

    @RequestMapping("order")
    public Order feignOrder(){
        return remoteOrder.getRemoteOrder();
    }
}
