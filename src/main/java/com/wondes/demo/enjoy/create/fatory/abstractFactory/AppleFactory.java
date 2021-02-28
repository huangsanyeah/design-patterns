package com.wondes.demo.enjoy.create.fatory.abstractFactory;

import com.wondes.demo.enjoy.entity.Bag;
import com.wondes.demo.enjoy.entity.Fruit;
import com.wondes.demo.enjoy.entity.bag.AppleBag;
import com.wondes.demo.enjoy.entity.fruit.Apple;

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
