package com.wonders.demo.enjoy.create.fatory.abstractFactory;


import com.wonders.demo.enjoy.entity.Bag;
import com.wonders.demo.enjoy.entity.Fruit;

/**
 * 抽象水果工厂
 */
public abstract class AbstractFactory {

    public abstract Fruit getFruit();

    public abstract Bag getBag();

}
