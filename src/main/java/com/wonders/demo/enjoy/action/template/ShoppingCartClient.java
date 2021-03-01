package com.wonders.demo.enjoy.action.template;


import com.wonders.demo.enjoy.action.strategy.Discount;
import com.wonders.demo.enjoy.action.strategy.FullDiscount;
import com.wonders.demo.enjoy.action.strategy.NewerDiscount;
import com.wonders.demo.enjoy.action.strategy.SecondDiscount;
import com.wonders.demo.enjoy.create.fatory.simple.StaticFactory;
import com.wonders.demo.enjoy.entity.Fruit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 模板方法模式
 * 订单费用结算过程
 */
public class ShoppingCartClient {

    private static Map<String, Discount> disCounts = new HashMap();
    static {
        disCounts.put("full",new FullDiscount());
        disCounts.put("newer",new NewerDiscount());
        disCounts.put("second",new SecondDiscount());
    }

    public static void main(String[] args) {
        List<Fruit> products = new ArrayList();

        products.add(StaticFactory.getFruitApple());
        products.add(StaticFactory.getFruitBanana());
        products.add(StaticFactory.getFruitOrange());

        //模板方法
        ShoppingCart cart = new CartShopping(products);
//        ShoppingCart cart = new CashShopping(products);
//        ShoppingCart cart = new OnlineShopping(products);
//        ShoppingCart cart = new OtherPayShopping(products);

        //TODO 策略模式注释，注入优惠方案
        String discount = "full";
//        String discount = "newer";
//        String discount = "second";
        cart.setDiscount(disCounts.get(discount));

        cart.submitOrder();
    }


}
