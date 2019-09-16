package com.poplar.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By poplar on 2019/9/16
 */
public class EmployeeList {

    private List<IEmployee> list = new ArrayList<>();

    //增加
    public void attach(IEmployee employee) {
        list.add(employee);
    }

    //删除员工
    public void detach(IEmployee employee) {
        list.remove(employee);
    }

    public void accept(Department department) {
        for (IEmployee employee : list) {
            employee.accept(department);
        }

    }
}
