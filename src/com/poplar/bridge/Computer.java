package com.poplar.bridge;

/**
 * Created By poplar on 2019/9/15
 * 炒菜抽象类
 */
public abstract class Computer {

    Brand brand = null;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public abstract void sale();

}
