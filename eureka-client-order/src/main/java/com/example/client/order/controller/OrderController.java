package com.example.client.order.controller;

import com.example.client.order.order.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @RequestMapping("detail")
    public Order getOrderInfo(){
        return new Order();
    }
}
