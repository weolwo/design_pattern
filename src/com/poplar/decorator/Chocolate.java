package com.poplar.decorator;

/**
 * Created By poplar on 2019/9/12
 * 巧克力
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setName("巧克力");
        setPrice(10.0);
    }
}
