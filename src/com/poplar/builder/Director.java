package com.poplar.builder;

/**
 * Created By poplar on 2019/9/11
 * 指挥者
 */
public class Director {

    PhoneBuilder phoneBuilder = null;

    public Director(PhoneBuilder phoneBuilder) {
        this.phoneBuilder = phoneBuilder;
    }

    public void setPhoneBuilder(PhoneBuilder phoneBuilder) {
        this.phoneBuilder = phoneBuilder;
    }

    /**
     * 指挥建造者生产
     */
    Phone productPhone() {
        return phoneBuilder.assembleComplete();
    }
}
