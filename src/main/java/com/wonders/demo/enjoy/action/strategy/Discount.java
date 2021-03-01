package com.wonders.demo.enjoy.action.strategy;

/**
 * 抽象出来的优惠券接口，实现： 满减 假日全免 首次购 第二单9折优惠
 */
public interface Discount {
    int calculate(int money);
}
