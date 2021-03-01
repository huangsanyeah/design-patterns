package com.wonders.demo.enjoy.structure.adapter;


import com.wonders.demo.enjoy.entity.bag.AppleBag;
import com.wonders.demo.enjoy.entity.bag.OrangeBag;

/**
 * 桔子包装适配器类，用AppleBag来实现适配
 */
public class OrangeBagAdapter extends OrangeBag {
    private AppleBag appleBag;

    OrangeBagAdapter(AppleBag appleBag){
        this.appleBag = appleBag;
    }

    @Override
    public void pack() {
        appleBag.pack();
    }
}
