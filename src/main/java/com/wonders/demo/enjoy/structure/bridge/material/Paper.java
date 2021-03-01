package com.wonders.demo.enjoy.structure.bridge.material;

/**
 * 包装接口
 * Material
 */
public class Paper implements Material{
    @Override
    public void draw(){
        System.out.print("用纸盒");
    }

}
