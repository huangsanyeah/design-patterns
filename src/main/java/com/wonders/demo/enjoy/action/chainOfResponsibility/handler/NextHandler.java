package com.wonders.demo.enjoy.action.chainOfResponsibility.handler;

import com.wonders.demo.enjoy.action.chainOfResponsibility.ChainOfResponsibilityRequest;
import com.wonders.demo.enjoy.action.chainOfResponsibility.Handler;

/**
 * @author huangweiyue
 * TODO 注释：责任链的另外一种实现形式，通过next来交给下一个来处理
 * 当然，可以是当前Handler处理完了交给下一个，也可以是有顺序的比如当前处理完了就不需要交给下一个。
 * @date Created in 2021-03-02
 */
public class NextHandler implements Handler {
    private Handler next;

    @Override
    public Boolean process(ChainOfResponsibilityRequest request) {
        if (!canProcess(request)) {
            // 手动交给下一个Handler处理:
            next.process(request);
        } else {
            //
        }
        return false;
    }

    private boolean canProcess(ChainOfResponsibilityRequest responsibilityRequest) {
        return false;
    }
}
