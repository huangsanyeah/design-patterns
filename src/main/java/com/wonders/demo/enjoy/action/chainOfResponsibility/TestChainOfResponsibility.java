package com.wonders.demo.enjoy.action.chainOfResponsibility;

import com.wonders.demo.enjoy.action.chainOfResponsibility.handler.CEOHandler;
import com.wonders.demo.enjoy.action.chainOfResponsibility.handler.DirectorHandler;
import com.wonders.demo.enjoy.action.chainOfResponsibility.handler.ManagerHandler;

import java.math.BigDecimal;



/**
 * Learn Java from https://www.liaoxuefeng.com/
 * lxf老师责任链代码实现
 *
 * 责任链模式把多个处理器串成链，然后让请求在链上传递
 * 在实际场景中，财务审批就是一个责任链模式。假设某个员工需要报销一笔费用，审核者可以分为：
 * Manager：只能审核1000元以下的报销；
 * Director：只能审核10000元以下的报销；
 * CEO：可以审核任意额度。
 * 用责任链模式设计此报销流程时，每个审核者只关心自己责任范围内的请求，并且处理它。
 * 对于超出自己责任范围的，扔给下一个审核者处理，这样，将来继续添加审核者的时候，不用改动现有逻辑
 */
public class TestChainOfResponsibility {

	public static void main(String[] args) {
		// 构造责任链:注意Handler的添加顺序
		HandlerChain chain = new HandlerChain();
		chain.addHandler(new ManagerHandler());
		chain.addHandler(new DirectorHandler());
		chain.addHandler(new CEOHandler());
		// 处理请求:
		chain.process(new ChainOfResponsibilityRequest("Bob", new BigDecimal("123.45")));
		chain.process(new ChainOfResponsibilityRequest("Alice", new BigDecimal("1234.56")));
		chain.process(new ChainOfResponsibilityRequest("Bill", new BigDecimal("12345.67")));
		chain.process(new ChainOfResponsibilityRequest("John", new BigDecimal("123456.78")));
	}
}
