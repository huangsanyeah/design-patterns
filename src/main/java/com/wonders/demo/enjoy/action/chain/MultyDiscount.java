package com.wonders.demo.enjoy.action.chain;


import com.wonders.demo.enjoy.action.strategy.Discount;

/**
 * 责任链模式抽象父类
 */
public abstract class MultyDiscount implements Discount {
    protected MultyDiscount nextMultyDiscount;

    public MultyDiscount(MultyDiscount nextMultyDiscount) {
        this.nextMultyDiscount = nextMultyDiscount;
    }

    @Override
    public int calculate(int money) {
        if (this.nextMultyDiscount != null) {
            return this.nextMultyDiscount.calculate(money);
        }
        return money;
    }

}
