package com.poplar.decorator;

/**
 * Created By poplar on 2019/9/12
 */
public class Coffee extends Drink {

    @Override
    public Double computerCost() {
        return super.getPrice();
    }
}
