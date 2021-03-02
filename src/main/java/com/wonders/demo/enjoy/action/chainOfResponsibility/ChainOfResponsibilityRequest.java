package com.wonders.demo.enjoy.action.chainOfResponsibility;

import java.math.BigDecimal;

public class ChainOfResponsibilityRequest {

	private String name;
	private BigDecimal amount;

	public ChainOfResponsibilityRequest(String name, BigDecimal amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return String.format("{Request: name=%s, amount=%s}", name, amount);
	}
}
