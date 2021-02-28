package com.wondes.demo.enjoy.structure.proxy;

import com.wondes.demo.enjoy.service.OrderService;

/**
 * 代理模式A不能直接访问C 通过B访问C
 * 客户端无法直接调用OuterOrderService，所以做了代理ProxyOrder来中转
 * 类似装饰器模式
 * 代售进口水果
 */
public class ProxyClient {
    public static void main(String[] args){
        saveOrder();
    }

     private static void saveOrder(){
        //本地代理类
        OrderService orderService = new ProxyOrder();

        orderService.saveOrder();

        //其它业务代码。。。。

    }



}
