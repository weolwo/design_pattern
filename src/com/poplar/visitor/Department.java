package com.poplar.visitor;

/**
 * Created By poplar on 2019/9/16
 */
public abstract class Department {
    //声明一组重载的方法
    public abstract void visit(FullTimeEmployee fullTimeEmployee);

    public abstract void visit(PartTimeEmployee partTimeEmployee);


}
