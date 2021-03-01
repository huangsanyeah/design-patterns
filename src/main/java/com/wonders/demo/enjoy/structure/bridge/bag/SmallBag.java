package com.wonders.demo.enjoy.structure.bridge.bag;

/**
 * 采摘小袋
 * Material
 */
public class SmallBag extends BagAbstraction {

    @Override
    public void pick(){
        System.out.println("采摘水果开始");
        this.material.draw();
        System.out.println("采摘了一小包");
    }

}
