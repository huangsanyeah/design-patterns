package com.wonders.demo.enjoy.create.fatory.fatoryMethod;


import com.wonders.demo.enjoy.entity.Bag;
import com.wonders.demo.enjoy.entity.bag.BananaBag;

/**
 * 工厂方法模式
 */
public class BananaBagFactory implements BagFactory{
    @Override
    public Bag getBag(){
        return new BananaBag();
    }
}
