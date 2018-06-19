package com.example.client.order.order;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter@Getter
public class Order {
    private Integer id = 123123;
    private BigDecimal totalPrice = new BigDecimal("87.98");
    private String orderStatus = "已付款";
}
