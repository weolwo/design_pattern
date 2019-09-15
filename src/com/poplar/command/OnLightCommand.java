package com.poplar.command;

/**
 * Created By poplar on 2019/9/15
 */
public class OnLightCommand implements Command {

    private LightReceiver lightReceiver = null;

    public OnLightCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
