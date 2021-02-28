package com.wondes.demo.enjoy.create.fatory.fatoryMethod;


import com.wondes.demo.enjoy.entity.Bag;
import com.wondes.demo.enjoy.entity.bag.BananaBag;

/**
 * 工厂方法模式
 */
public class BananaBagFactory implements BagFactory{
    @Override
    public Bag getBag(){
        return new BananaBag();
    }
}
