package com.wonders.demo.enjoy.structure.bridge.bag;


import com.wonders.demo.enjoy.structure.bridge.material.Material;

/**
 * 采摘容器 大 中 小 迷你
 */
public abstract class BagAbstraction {
    protected Material material;
//    protected Material material;

    public void setMaterial(Material material){
        this.material = material;
    }

    //采摘
    public abstract void pick();

}
