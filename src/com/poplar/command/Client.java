package com.poplar.command;

/**
 * Created By poplar on 2019/9/15
 * <p>
 * 测试类
 */
public class Client {

    public static void main(String[] args) {
        /***
         * 家用智能遥控
         * .----------- .
         * . 电灯 开 关 .
         * . 空调 开 关 .
         * .    撤销    .
         * . ............           .
         *
         */
        //使用命令模式完成对电灯的相关操作

        //插件命令接受了
        LightReceiver lightReceiver = new LightReceiver();

        //插件开命令对象
        OnLightCommand onLightCommand = new OnLightCommand(lightReceiver);

        //创建关命令对象
        OffLightCommand offLightCommand = new OffLightCommand(lightReceiver);

        //创建遥控
        RemoteControl remoteControl = new RemoteControl();
        //设置命令,0代表电灯的开关命令
        remoteControl.setCommands(0, onLightCommand, offLightCommand);
        //打开电灯
        remoteControl.onButtonWasPress(0);
        //关闭订单
        remoteControl.offButtonWasPress(0);
        //撤销操作
        remoteControl.cancelButtonWasPress(0);

        System.out.println("**************************************");
        //使用遥控打开电视
        TVReceiver tvReceiver = new TVReceiver();
        OnTVCommand onTVCommand = new OnTVCommand(tvReceiver);
        OffTVCommand offTVCommand = new OffTVCommand(tvReceiver);
        remoteControl.setCommands(1, onTVCommand, offTVCommand);
        remoteControl.onButtonWasPress(1);
        //使用遥控关闭电视
        remoteControl.offButtonWasPress(1);
        //撤销操作
        remoteControl.cancelButtonWasPress(1);
    }
}
