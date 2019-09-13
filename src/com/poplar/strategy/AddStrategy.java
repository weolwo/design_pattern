package com.poplar.strategy;

/**
 * Created By poplar on 2019/9/13
 * 加法策略算法
 */
public class AddStrategy implements Strategy {
    @Override
    public Integer calculator(Integer a, Integer b) {
        return a + b;
    }
}
