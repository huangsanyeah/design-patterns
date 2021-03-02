package com.wonders.demo.enjoy.action.chainOfResponsibility.handler;

import com.wonders.demo.enjoy.action.chainOfResponsibility.Handler;
import com.wonders.demo.enjoy.action.chainOfResponsibility.ChainOfResponsibilityRequest;

import java.math.BigDecimal;

public class ManagerHandler implements Handler {

	@Override
	public Boolean process(ChainOfResponsibilityRequest chainOfResponsibilityRequest) {
		if (chainOfResponsibilityRequest.getAmount().compareTo(BigDecimal.valueOf(1000)) > 0) {
			return null;
		}
		return !chainOfResponsibilityRequest.getName().equalsIgnoreCase("bob");
	}
}
