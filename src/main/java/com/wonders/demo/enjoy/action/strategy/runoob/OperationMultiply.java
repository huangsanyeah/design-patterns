package com.wonders.demo.enjoy.action.strategy.runoob;


public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
