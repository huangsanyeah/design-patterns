package com.wonders.demo.enjoy.action.chainOfResponsibility;

public interface Handler {
    /**
     * 返回Boolean.TRUE = 成功
     * 返回Boolean.FALSE = 拒绝
     * 返回null = 交下一个处理
     */
    Boolean process(ChainOfResponsibilityRequest chainOfResponsibilityRequest);
}
