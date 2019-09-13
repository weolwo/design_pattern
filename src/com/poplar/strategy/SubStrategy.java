package com.poplar.strategy;

/**
 * Created By poplar on 2019/9/13
 * 减法策略
 */
public class SubStrategy implements Strategy {
    @Override
    public Integer calculator(Integer a, Integer b) {
        return a - b;
    }
}
