package com.poplar.command;

/**
 * Created By poplar on 2019/9/15
 * 命令接收者,相当于饭店的服务员
 */
public class LightReceiver {

    public void on() {
        System.out.println("电灯已打开~~~~");
    }

    public void off() {
        System.out.println("电灯已关闭~~~~");
    }
}
