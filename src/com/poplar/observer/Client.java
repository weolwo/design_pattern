package com.poplar.observer;

/**
 * Created By poplar on 2019/9/1
 * 客服端调用测试类
 */
public class Client {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        BaiduWeather baiduWeather = new BaiduWeather();
        YunNanWeather yunNanWeather = new YunNanWeather();
        weatherStation.setData(33, 345, 66);
        weatherStation.register(baiduWeather);
        weatherStation.register(yunNanWeather);
        weatherStation.notifyAllObserves();
    }
}
