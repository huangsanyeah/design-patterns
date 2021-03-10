package com.wonders.demo.enjoy.structure.proxy.dynamic.jdk;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description
 * @date Created in 2021-03-10
 * @modifiedBy
 */
class HelloImpl implements Hello{

    @Override
    public void morning(String name) {
        System.out.println("HelloImp: " + name);
    }
}
