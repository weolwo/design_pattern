package com.poplar.bridge;

/**
 * Created By poplar on 2019/9/15
 * 笔记本电脑
 */
public class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        System.out.println("出售"+brand.sale()+"笔记本电脑 ");
    }
}
