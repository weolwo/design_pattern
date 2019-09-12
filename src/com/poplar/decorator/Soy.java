package com.poplar.decorator;

/**
 * Created By poplar on 2019/9/12
 * 豆浆
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setName("豆浆");
        setPrice(5.0);
    }
}
