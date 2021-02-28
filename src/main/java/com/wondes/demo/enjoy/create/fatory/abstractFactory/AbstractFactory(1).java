package com.wondes.demo.enjoy.create.fatory.abstractFactory;


import com.wondes.demo.enjoy.entity.Bag;
import com.wondes.demo.enjoy.entity.Fruit;

/**
 * 抽象水果工厂
 */
abstract class AbstractFactory {

    public abstract Fruit getFruit();

    public abstract Bag getBag();

}
