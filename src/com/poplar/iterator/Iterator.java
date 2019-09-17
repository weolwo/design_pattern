package com.poplar.iterator;

/**
 * Created By poplar on 2019/9/17
 * 迭代器接口类
 */
public interface Iterator {
    /*是否还有下一个*/
    boolean hasNext();

    /*获取下一个对象*/
    Object next();
}
