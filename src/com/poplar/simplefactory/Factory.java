package com.poplar.simplefactory;

/**
 * Created By poplar on 2019/9/11
 */
public class Factory {

    public static Cake productCake(String name) {
        if ("china".equals(name)) {
            return new ChinaCake(name);
        } else if ("west".equals(name)) {
            return new WestCake(name);
        } else {
            return null;
        }
    }
}
