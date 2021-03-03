package com.wonders.demo.enjoy.create.fatory.abstractFactory;


import com.wonders.demo.enjoy.entity.Bag;
import com.wonders.demo.enjoy.entity.Fruit;

/**
 * 抽象工厂模式测试
 * 按订单发送货品给客户
 *
 * 【抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂】。
 * 该超级工厂又称为其他【工厂的工厂】
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。
 * 每个生成的工厂都能按照工厂模式提供对象
 */
public class OrderSendClient {
    public static void main(String[] args){
        sendFruit();
    }

    public static void sendFruit(){
        //初始化工厂
        AbstractFactory factory = new AppleFactory();//spring使用注入方式

        //得到水果
        Fruit fruit = factory.getFruit();
        fruit.draw();
        //得到包装
        Bag bag = factory.getBag();
        bag.pack();
        //以下物流运输业务。。。。

    }



}
