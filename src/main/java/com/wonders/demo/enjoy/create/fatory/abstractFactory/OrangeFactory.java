package com.wonders.demo.enjoy.create.fatory.abstractFactory;


import com.wonders.demo.enjoy.entity.Bag;
import com.wonders.demo.enjoy.entity.Fruit;
import com.wonders.demo.enjoy.entity.bag.OrangeBag;
import com.wonders.demo.enjoy.entity.fruit.Orange;

/**
 * 水果工厂
 */
public class OrangeFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Orange("Peter",50);
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
