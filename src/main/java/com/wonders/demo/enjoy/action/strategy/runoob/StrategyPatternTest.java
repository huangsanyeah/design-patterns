package com.wonders.demo.enjoy.action.strategy.runoob;

/**
 * @author huangweiyue
 * @description 测试类
 * @date Created in 2021-03-06
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
