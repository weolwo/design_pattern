package com.poplar.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By poplar on 2019/9/1
 * 核心类,模拟气象站
 */

public class WeatherStation implements Subject {
    /*温度*/
    private double temperature;
    /*气压*/
    private double pressure;
    /*湿度*/
    private double humidity;
    /*观察者集合*/
    private Set<Observer> observers = new HashSet<Observer>();


    void setData(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    //注册
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    //移除
    @Override
    public void remove(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    /*当数据变化时通知所有观察者*/
    @Override
    public void notifyAllObserves() {
        //遍历所有注册的观察者并调用观察者的更新方法更新数据;
        for (Observer observer : observers) {
            observer.update(this.temperature, this.pressure, this.humidity);
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
