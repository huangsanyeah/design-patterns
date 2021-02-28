package com.wondes.demo.enjoy.entity;


import com.wondes.demo.enjoy.action.visit.Visit;

/**
 * 水果接口
 */
public interface Fruit {

    int price();

    void draw();

    int accept(Visit visit);

}
