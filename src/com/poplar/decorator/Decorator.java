package com.poplar.decorator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created By poplar on 2019/9/12
 * 装饰着
 */
public class Decorator extends Drink {

    Drink drink = null;

    /*组合进来*/
    public Decorator(Drink drink) {
        this.drink = drink;
    }

    /**
     * 计算成本,自己的价格加上组合进来对象的价格
     *
     * @return
     */
    @Override
    public Double computerCost() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        BigDecimal value = new BigDecimal(getPrice()).add(new BigDecimal(drink.computerCost()));
        return Double.valueOf(decimalFormat.format(value));
    }

    Map map = new HashMap();

    /**
     * 输出被装饰者的信息
     *
     * @return
     */
    @Override
    public String getName() {
        map.put(name, getPrice());
        System.out.println(map);
        return drink.getName();
    }
}
