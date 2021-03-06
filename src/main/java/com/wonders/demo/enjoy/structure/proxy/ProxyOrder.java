package com.wonders.demo.enjoy.structure.proxy;


import com.wonders.demo.enjoy.service.OrderService;
import com.wonders.demo.enjoy.service.impl.OutOrderServiceImpl;

public class ProxyOrder implements OrderService {

    //真实的订单服务
    private OrderService orderService = new OutOrderServiceImpl();

    @Override
    public int saveOrder() {
        System.out.println("开始海外下订单");
        return orderService.saveOrder();
    }
}
