package com.example.client.order.order;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Setter@Getter
@Component
public class Order {
    private Integer id = 123123;
    private BigDecimal totalPrice = new BigDecimal("87.98");
    @Value("${order.status}")
    private String orderStatus;
}
