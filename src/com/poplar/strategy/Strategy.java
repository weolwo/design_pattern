package com.poplar.strategy;

/**
 * Created By poplar on 2019/9/13
 * 第一策略角色.类似于Comparator<T>接口
 */
public interface Strategy {

    Integer calculator(Integer a, Integer b);
}
