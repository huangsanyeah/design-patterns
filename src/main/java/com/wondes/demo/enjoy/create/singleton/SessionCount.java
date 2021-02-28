package com.wondes.demo.enjoy.create.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 懒汉 饿汉
 */
public class SessionCount {
    //2.静态的类实例
    private static SessionCount instance;//懒汉式
    private AtomicInteger count = new AtomicInteger(0);
//    private static SessionCount instance=new SessionCount();//饿汉式

    //1.私有构造
    private SessionCount() {
    }

    //3.初始化对象
    //获取唯一可用的对象
    //懒汉式 有需要的时候再去创建 而不是初始化类就创建
    public static SessionCount getInstance() {
        //不为空，才创建
        if (instance == null) {
            //双重校验锁
            synchronized (SessionCount.class) {
                //防止多线程同时创建的情况，所以这里还需要判断下为null
                if (instance == null) {
                    instance = new SessionCount();
                }
            }
        }

        return instance;
    }

    /***以下是业务方法***/
    int plus() {
        return count.incrementAndGet();
    }

    int decrease() {
        return count.decrementAndGet();
    }

    void showMessage() {
        System.out.println("当前人数：" + this.count.get());
    }


}
