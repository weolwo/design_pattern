package com.poplar.command;

/**
 * Created By poplar on 2019/9/15
 * 空命令,用于初始化每个按钮
 * 当调用空命令时,对象什么都不做,省去了空判断
 */
public class NotCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
