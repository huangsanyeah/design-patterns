package com.wondes.demo.enjoy.action.command.command;


import com.wondes.demo.enjoy.action.command.Command;
import com.wondes.demo.enjoy.action.command.handler.HotHandler;

public class HotCommand extends Command {
    private HotHandler handler = new HotHandler();

    @Override
    public String execute() {
        return handler.getHots();
    }
}
