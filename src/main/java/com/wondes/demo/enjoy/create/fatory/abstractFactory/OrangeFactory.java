package com.wondes.demo.enjoy.create.fatory.abstractFactory;


import com.wondes.demo.enjoy.entity.Bag;
import com.wondes.demo.enjoy.entity.Fruit;
import com.wondes.demo.enjoy.entity.bag.OrangeBag;
import com.wondes.demo.enjoy.entity.fruit.Orange;

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
