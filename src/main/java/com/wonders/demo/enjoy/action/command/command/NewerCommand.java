package com.wonders.demo.enjoy.action.command.command;


import com.wonders.demo.enjoy.action.command.Command;
import com.wonders.demo.enjoy.action.command.handler.NewerHandler;

public class NewerCommand extends Command {
    private NewerHandler handler = new NewerHandler();

    @Override
    public String execute() {
        return handler.getNewers();
    }
}
