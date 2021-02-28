package com.wondes.demo.enjoy.structure.decorator;


import com.wondes.demo.enjoy.entity.Bag;

/**
 * 防伪
 */
public class CheckedBagDecorator extends BagDecorator {
    public CheckedBagDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        super.pack();  //调用原有业务方法
        checked();  //打印防伪标识
    }

    //增加防伪标识
    public void checked() {
        System.out.println("------");
        System.out.println("打印上防伪标识");
    }
}
