package com.wonders.demo.enjoy.action.visit;


import com.wonders.demo.enjoy.create.fatory.simple.StaticFactory;
import com.wonders.demo.enjoy.entity.Fruit;
import com.wonders.demo.enjoy.entity.fruit.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式
 * 商品库存统计
 * 注意看下test1(),test2()方法
 */
public class VisitClient {
    private static Visit visit = new Visit();
    private static List<Fruit> list = new ArrayList<>();//库存

    static {
        list.add(StaticFactory.getFruitApple());
        list.add(StaticFactory.getFruitOrange());
        list.add(StaticFactory.getFruitBanana());
        list.add(StaticFactory.getFruitApple());
        list.add(StaticFactory.getFruitOrange());
    }

    public static void main(String[] args) {
        //test1();
        test2();
        //price();
    }

    //统计库存
    private static int price() {
        int total = 0;
        for (Fruit fruit : list) {
            //FIXME 这种出错 无法识别Fruit的真实类型
//            total += visit.sell(fruit);

            //访问者模式，通过指针传递真实对象，是一种双重分派机制，利用双重分派机制，弥补java多态中的方法重载是静态化的不足
            //TODO 注释：关键代码在此
            total += fruit.accept(visit);
        }

        System.out.println("总价值：" + total);
        return total;
    }

    /**
     * Apple是Fruit的子类，虽然Visit.sell方法中重载了Apple，Orange，Banana的sell方法，
     * 但是直接调用把apple赋值给Fruit后去调用Fruit的sell还是无法识别其真正的类型Apple
     * visit.sell
     */
    private static void test1() {
        Apple apple = new Apple();
        Fruit fruit = apple;

        //不能识别fruit对象的真实类型
        int price = visit.sell(fruit);
        System.out.println("fruit价格：" + price);

        price = visit.sell(apple);
        System.out.println("apple价格：" + price);
    }

    /**
     * 对比test1()用fruit.accept(visit)即可传递真实的引用类型Apple
     * fruit.accept
     */
    private static void test2() {
        Apple apple = new Apple();
        Fruit fruit = apple;

        int price = fruit.accept(visit);
        System.out.println("价格：" + price);
    }
}
