package com.poplar.strategy;

import java.util.TreeMap;

/**
 * Created By poplar on 2019/9/13
 * 环境角色
 */
public class Context {

    //使用聚合的方式把策略聚合进来
    private Strategy strategy = null;

    //类似于 Arrays.sort()方法,sort(T[] a, Comparator<? super T> c)
    // 同时也类似于:TreeSet
 /* TreeSet(Comparator<? super E> comparator) {
        this(new TreeMap<>(comparator));
    }*/
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context() {
    }

    public Integer calculator(Integer num1, Integer num2) {
        return strategy.calculator(num1, num2);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
