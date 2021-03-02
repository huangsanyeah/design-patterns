package com.wonders.demo.enjoy.action.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {

	private List<Handler> handlers = new ArrayList<>();

	public void addHandler(Handler handler) {
		this.handlers.add(handler);
	}

	public boolean process(ChainOfResponsibilityRequest chainOfResponsibilityRequest) {
		for (Handler handler : handlers) {
			Boolean r = handler.process(chainOfResponsibilityRequest);
			if (r != null) {
				System.out.println(
						chainOfResponsibilityRequest + " " + (r ? "Approved by " : "Denied by ") + handler.getClass().getSimpleName());
				return r;
			}
		}
		throw new RuntimeException("Could not handle request: " + chainOfResponsibilityRequest);
	}
}
