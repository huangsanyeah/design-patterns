package com.wonders.demo.enjoy.action.chainOfResponsibility.handler;

import com.wonders.demo.enjoy.action.chainOfResponsibility.Handler;
import com.wonders.demo.enjoy.action.chainOfResponsibility.ChainOfResponsibilityRequest;

import java.math.BigDecimal;

public class CEOHandler implements Handler {

	@Override
	public Boolean process(ChainOfResponsibilityRequest chainOfResponsibilityRequest) {
		if (chainOfResponsibilityRequest.getAmount().compareTo(BigDecimal.valueOf(50000)) > 0) {
			return Boolean.FALSE;
		}
		return !chainOfResponsibilityRequest.getName().equalsIgnoreCase("alice");
	}
}
