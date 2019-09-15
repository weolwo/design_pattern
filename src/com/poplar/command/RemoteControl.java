package com.poplar.command;

/**
 * Created By poplar on 2019/9/15
 * 遥控器
 */
public class RemoteControl {

    //开关撤销按钮命令组
    private Command[] onCommands;
    private Command[] offCommands;
    private Command cancelCommands;

    public RemoteControl() {
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];
        //按钮初始化
        for (int i = 0; i < 5; i++) {
            this.onCommands[i] = new NotCommand();
            this.offCommands[i] = new NotCommand();
        }
    }

    //给我们的按钮设置你需要的命令,我们假设 0 代表电灯
    public void setCommands(int num, Command onLightCommand, Command offLightCommand) {
        this.onCommands[num] = onLightCommand;
        this.offCommands[num] = offLightCommand;
    }

    //当按下开按钮时
    public void onButtonWasPress(int num) {
        this.onCommands[num].execute();
        //记录这次操作,用于撤销
        cancelCommands = this.onCommands[num];
    }

    //当按下关按钮时
    public void offButtonWasPress(int num) {
        this.offCommands[num].execute();
        //记录这次操作,用于撤销
        cancelCommands = this.offCommands[num];
    }

    //当按下撤销按钮时
    public void cancelButtonWasPress(int num) {
        this.cancelCommands.undo();
    }
}
