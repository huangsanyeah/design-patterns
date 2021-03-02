package com.wonders.demo.enjoy.action.chain;


import com.wonders.demo.enjoy.action.template.OtherPayShopping;
import com.wonders.demo.enjoy.action.template.ShoppingCart;
import com.wonders.demo.enjoy.create.fatory.simple.StaticFactory;
import com.wonders.demo.enjoy.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板方法模式
 * 订单费用结算过程
 */
public class ChainCartTestClient {

    //初始化满减优惠券
    private static MultyDiscount multyDiscount = new FullMultyDiscount(null);
    static {
        multyDiscount = new NewerMultyDiscount(multyDiscount);
        multyDiscount = new SecondMultyDiscount(multyDiscount);
        multyDiscount = new HolidayMultyDiscount(multyDiscount);


    }

    public static void main(String[] args) {
        List<Fruit> products = new ArrayList();

        products.add(StaticFactory.getFruitApple());
        products.add(StaticFactory.getFruitBanana());
        products.add(StaticFactory.getFruitOrange());

        ShoppingCart cart = new OtherPayShopping(products);


        /**
         * TODO 注入优惠方案链条的第一个节点，断点打到此处，查看multyDiscount的值，
         * 实际上就是把多个MultyDiscount通过setNext的方式串起来，要注意先后顺序
         */
        cart.setDiscount(multyDiscount);
        //这个方法内才会执行责任链模式的业务代码discount.calculate(money)
        cart.submitOrder();
    }


}
