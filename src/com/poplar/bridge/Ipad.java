package com.poplar.bridge;

/**
 * Created By poplar on 2019/9/15
 * ipad电脑
 */
public class Ipad extends Computer {
    public Ipad(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        System.out.println("销售" + brand.sale() + "平板电脑");
    }
}
