package com.poplar.decorator;

/**
 * Created By poplar on 2019/9/12
 */
public class RedWine extends Decorator{

    public RedWine(Drink drink) {
        super(drink);
        setName("拉菲");
        setPrice(20.0);
    }
}
