package com.wondes.demo.enjoy.structure.composite;

import java.util.List;

/**
 * 节点
 */
public abstract class Node {
    /**
     * 名字
     */
    private String name;

    Node(String name){
        this.name = name;
    }

    /**
     * 获取子节点
     */
    public abstract List<Node> getChildren();

    public String getName() {
        return name;
    }
}
