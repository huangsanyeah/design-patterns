package com.wonders.demo.enjoy.create.fatory.abstractFactory;

import com.wonders.demo.enjoy.entity.Bag;
import com.wonders.demo.enjoy.entity.Fruit;
import com.wonders.demo.enjoy.entity.bag.AppleBag;
import com.wonders.demo.enjoy.entity.fruit.Apple;

/**
 * 水果工厂
 */
public class AppleFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
