package com.poplar.observer;

/**
 * Created By poplar on 2019/9/1
 * 观察者接口
 */
public interface Observer {

    public void update(double temperature, double pressure, double humidity);
}
