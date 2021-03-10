package com.wonders.demo.enjoy.structure.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author huangweiyue
 * @description JDK实现动态代理 说明参见云笔记文档
 * @date Created in 2021-03-10
 */
public class JdkDynamicProxy2 implements InvocationHandler {

    private Hello hello;

    private JdkDynamicProxy2(Hello hello) {
        this.hello = hello;
    }

    public static void main(String[] args) {
        // 2. 然后在需要使用Hello的时候，通过JDK动态代理获取Hello的代理对象。
        Hello hello = (Hello) Proxy.newProxyInstance(
                JdkDynamicProxy2.class.getClassLoader(), // 1. 类加载器
                new Class<?>[]{Hello.class}, // 2. 代理需要实现的接口，可以有多个
                new JdkDynamicProxy2(new HelloImpl()));// 3. 方法调用的实际处理者
        hello.morning("sayHello");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if ("morning".equals(method.getName())) {
            System.out.println("You said: " + Arrays.toString(args));

        }
        System.out.println("方法前");
        Object obj = method.invoke(hello, args);
        System.out.println("方法后");
        return obj;
    }
}
