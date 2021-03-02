package com.wonders.demo.enjoy.action.chainOfResponsibility;

import com.wonders.demo.enjoy.action.chainOfResponsibility.handler.CEOHandler;
import com.wonders.demo.enjoy.action.chainOfResponsibility.handler.DirectorHandler;
import com.wonders.demo.enjoy.action.chainOfResponsibility.handler.ManagerHandler;

import java.math.BigDecimal;



/**
 * Learn Java from https://www.liaoxuefeng.com/
 * lxf老师责任链代码实现
 */
public class TestChainOfResponsibility {

	public static void main(String[] args) {
		HandlerChain chain = new HandlerChain();
		chain.addHandler(new ManagerHandler());
		chain.addHandler(new DirectorHandler());
		chain.addHandler(new CEOHandler());
		chain.process(new ChainOfResponsibilityRequest("Bob", new BigDecimal("123.45")));
		chain.process(new ChainOfResponsibilityRequest("Alice", new BigDecimal("1234.56")));
		chain.process(new ChainOfResponsibilityRequest("Bill", new BigDecimal("12345.67")));
		chain.process(new ChainOfResponsibilityRequest("John", new BigDecimal("123456.78")));
	}
}
