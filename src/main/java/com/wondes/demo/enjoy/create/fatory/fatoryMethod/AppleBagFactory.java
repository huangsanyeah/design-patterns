package com.wondes.demo.enjoy.create.fatory.fatoryMethod;


import com.wondes.demo.enjoy.entity.Bag;
import com.wondes.demo.enjoy.entity.bag.AppleBag;

/**
 * 工厂方法模式
 */
public class AppleBagFactory implements BagFactory{
    @Override
    public Bag getBag(){
        return new AppleBag();
    }
}
