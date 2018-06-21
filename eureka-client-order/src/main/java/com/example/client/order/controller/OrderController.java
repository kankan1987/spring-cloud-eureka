package com.example.client.order.controller;

import com.example.client.order.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private Order order;
    @RequestMapping("detail")
    public Order getOrderInfo(HttpServletRequest request, HttpServletResponse response){
        System.out.println("cookie : "+request.getCookies());
        if (request.getCookies()!=null&&request.getCookies().length>0){
            for (Cookie cookie : request.getCookies()) {
                System.out.println(cookie.getName()+":"+cookie.getValue());
            }
        }

        Cookie cookie = new Cookie("zuul","test");
        response.addCookie(cookie);
        return order;
    }
}
