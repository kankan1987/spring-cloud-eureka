package com.example.feign.remote;

import com.example.feign.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SERVICE-ORDER")
public interface RemoteOrder {

    @RequestMapping("/order/detail")
    Order getRemoteOrder();
}
