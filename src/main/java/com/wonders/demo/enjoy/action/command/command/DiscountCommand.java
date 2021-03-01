package com.wonders.demo.enjoy.action.command.command;


import com.wonders.demo.enjoy.action.command.Command;
import com.wonders.demo.enjoy.action.command.handler.DiscountHandler;

public class DiscountCommand extends Command {

    private DiscountHandler handler = new DiscountHandler();

    @Override
    public String execute() {
        return handler.getDiscounts();
    }
}
