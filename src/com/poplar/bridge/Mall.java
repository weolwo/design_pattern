package com.poplar.bridge;

/**
 * Created By poplar on 2019/9/15
 * 商城
 */
public class Mall {

    public static void main(String[] args) {
        Computer computer = new Laptop(new Huawei());
        computer.sale();

        Computer computer2 = new Ipad(new Huawei());
        computer2.sale();

    }
}
