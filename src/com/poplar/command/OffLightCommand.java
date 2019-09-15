package com.poplar.command;

/**
 * Created By poplar on 2019/9/15
 * 电灯关闭按钮命令类
 */
public class OffLightCommand implements Command {

    private LightReceiver lightReceiver = null;

    public OffLightCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
