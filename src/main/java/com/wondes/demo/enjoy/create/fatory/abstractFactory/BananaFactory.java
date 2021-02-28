package com.wondes.demo.enjoy.create.fatory.abstractFactory;


import com.wondes.demo.enjoy.entity.Bag;
import com.wondes.demo.enjoy.entity.Fruit;
import com.wondes.demo.enjoy.entity.bag.BananaBag;
import com.wondes.demo.enjoy.entity.fruit.Banana;

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
