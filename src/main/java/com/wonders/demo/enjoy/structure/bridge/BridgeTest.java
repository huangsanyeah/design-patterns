package com.wonders.demo.enjoy.structure.bridge;

import com.wonders.demo.enjoy.structure.bridge.bag.BagAbstraction;
import com.wonders.demo.enjoy.structure.bridge.bag.SmallBag;
import com.wonders.demo.enjoy.structure.bridge.material.Material;
import com.wonders.demo.enjoy.structure.bridge.material.Paper;

/**
 * 园丁采摘水果
 * 桥接模式测试
 */
public class BridgeTest {

    public static void main(String[] args) {

        //袋子型号
        BagAbstraction bag = new SmallBag();

        //袋子材质
        Material material = new Paper();
        bag.setMaterial(material);

        //开始采摘
        bag.pick();
    }
}
