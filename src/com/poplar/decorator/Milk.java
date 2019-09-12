package com.poplar.decorator;

/**
 * Created By poplar on 2019/9/12
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setName("牛奶");
        setPrice(5.0);
    }
}
