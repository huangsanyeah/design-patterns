package com.wondes.demo.enjoy.create.fatory.fatoryMethod;


import com.wondes.demo.enjoy.entity.Fruit;
import com.wondes.demo.enjoy.entity.fruit.Banana;

/**
 * 工厂方法模式
 */
public class BananaFactory implements FruitFactory{
    @Override
    public Fruit getFruit(){
        return new Banana();
    }
}
