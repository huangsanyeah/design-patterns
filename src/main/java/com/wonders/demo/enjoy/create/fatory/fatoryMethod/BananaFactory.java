package com.wonders.demo.enjoy.create.fatory.fatoryMethod;


import com.wonders.demo.enjoy.entity.Fruit;
import com.wonders.demo.enjoy.entity.fruit.Banana;

/**
 * 工厂方法模式
 */
public class BananaFactory implements FruitFactory{
    @Override
    public Fruit getFruit(){
        return new Banana();
    }
}
