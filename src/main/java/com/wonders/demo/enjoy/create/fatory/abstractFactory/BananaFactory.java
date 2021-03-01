package com.wonders.demo.enjoy.create.fatory.abstractFactory;


import com.wonders.demo.enjoy.entity.Bag;
import com.wonders.demo.enjoy.entity.Fruit;
import com.wonders.demo.enjoy.entity.bag.BananaBag;
import com.wonders.demo.enjoy.entity.fruit.Banana;

/**
 * 水果工厂
 */
public class BananaFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
