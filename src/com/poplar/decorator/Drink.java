package com.poplar.decorator;

import com.sun.javafx.binding.IntegerConstant;

import java.math.BigDecimal;

/**
 * Created By poplar on 2019/9/12
 * 顶层抽象类,让装饰者和被装饰者继承
 */
public abstract class Drink {
    /*名称*/
     String name;
    /*价格*/
    private Double price = 0.0;

    //计算费用的抽象类
    public abstract Double computerCost();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
