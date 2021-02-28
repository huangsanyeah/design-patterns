package com.wondes.demo.enjoy.structure.composite;

import java.util.List;

/**
 * 叶子结点
 */
public class LeafNode extends Node{
    public LeafNode(String name) {
        super(name);
    }

    @Override
    public List<Node> getChildren() {
        return null;
    }

}
