package com.wonders.demo.enjoy.entity;


import com.wonders.demo.enjoy.action.visit.Visit;

/**
 * 水果接口
 */
public interface Fruit {

    int price();

    void draw();

    int accept(Visit visit);

}
