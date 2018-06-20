package com.example.feign.remote;

import com.example.feign.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderHystrix implements RemoteOrder {
    @Override
    public Order getRemoteOrder() {
        Order order = new Order();
        order.setOrderStatus("熔断order");
        return order;
    }
}
