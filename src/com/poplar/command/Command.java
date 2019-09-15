package com.poplar.command;

/**
 * Created By poplar on 2019/9/15
 * 命令接口
 */
public interface Command {

    /*执行*/
    public void execute();

    /*撤销操作*/
    public void undo();
}
