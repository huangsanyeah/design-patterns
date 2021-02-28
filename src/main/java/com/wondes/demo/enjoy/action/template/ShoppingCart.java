package com.wondes.demo.enjoy.action.template;


import com.wondes.demo.enjoy.action.strategy.Discount;
import com.wondes.demo.enjoy.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板方法模式
 * 购物车费用结算过程
 */
public abstract class ShoppingCart {
    //优惠方案
    private Discount discount;
    private List<Fruit> products = new ArrayList<>();

    public ShoppingCart(List<Fruit> products){
        this.products = products;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    //提交订单主流程
    public void submitOrder(){
        //计算商品金额
        int money = balance();
        System.out.println("商品总金额为："+money+"元");

        //TODO 注释：优惠减免【策略模式示例】
        money = discount.calculate(money);
        System.out.println("优惠减免后："+ money+"元，");

        //保存订单
        pay(money);

        //送货上门
        sendHome();

    }

    //计算金额
    private int balance(){
        int money = 0;
        System.out.print("商品清单：");
        for (Fruit fruit : products){
            fruit.draw();
            System.out.print(",");
            money += fruit.price();
        }
        return money;
    }

    private void sendHome(){
        System.out.println("三公里以内，免费送货上门");
    }

    //提交保存
    protected abstract void pay(int money);

}
