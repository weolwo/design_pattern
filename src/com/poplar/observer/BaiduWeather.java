package com.poplar.observer;

/**
 * Created By poplar on 2019/9/1
 * 模拟百度网站的天气
 */
public class BaiduWeather implements Observer {
    /*温度*/
    private double temperature;
    /*气压*/
    private double pressure;
    /*湿度*/
    private double humidity;

    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void change() {
        System.out.println("*********百度天气**************");
        System.out.println("今日温度: " + getTemperature());
        System.out.println("今日气压: " + getPressure());
        System.out.println("今日湿度: " + getHumidity());
    }


    public void display() {
        change();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }
}
