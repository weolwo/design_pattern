package com.poplar.command;

/**
 * Created By poplar on 2019/9/15
 */
public class OnTVCommand implements Command {

    private TVReceiver tvReceiver = null;

    public OnTVCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
