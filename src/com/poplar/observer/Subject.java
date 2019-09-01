package com.poplar.observer;

/**
 * Created By poplar on 2019/9/1
 * 主题类(被观察者)
 */
public interface Subject {

    public void register(Observer observer);

    public void remove(Observer observer);

    public void notifyAllObserves();
}
