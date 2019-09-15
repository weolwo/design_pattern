package com.poplar.bridge;

/**
 * Created By poplar on 2019/9/15
 * PC
 */
public class DesktopComputer extends Computer {

    public DesktopComputer(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        System.out.println("销售" + brand.sale() + "PC电脑");
    }
}
