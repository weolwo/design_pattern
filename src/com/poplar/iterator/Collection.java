package com.poplar.iterator;

/**
 * Created By poplar on 2019/9/17
 * 集合上层抽象类
 */
public abstract class Collection implements Iterator {

    /*添加元素*/
    public abstract void add(Object object);

    /*获取元素的个数*/
    public abstract int getSize();
}
