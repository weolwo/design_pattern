package com.poplar.command;

/**
 * Created By poplar on 2019/9/15
 * 电灯关闭按钮命令类
 */
public class OffTVCommand implements Command {

    private TVReceiver tvReceiver = null;

    public OffTVCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
