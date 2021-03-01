package com.wonders.demo.enjoy.structure.decorator;


import com.wonders.demo.enjoy.entity.Bag;

public class BagDecorator implements Bag {
    private Bag bag;  //维持一个对抽象构件对象的引用

    BagDecorator(Bag bag)  //注入一个抽象构件类型的对象
    {
        this.bag = bag;
    }

    @Override
    public void pack() {
        bag.pack();
    }
}
