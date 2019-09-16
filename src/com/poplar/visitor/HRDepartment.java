package com.poplar.visitor;

/**
 * Created By poplar on 2019/9/16
 * 人力资源部门
 */
public class HRDepartment extends Department {
    //实现人力部门对正式员工的数据访问
    @Override
    public void visit(FullTimeEmployee employee) {
        Double salary = employee.getSalary();
        int workTime = employee.getWorkTime();
        System.out.println("正式员工: " + employee.getName() + " 实际工作: " + employee.getWorkTime() + "小时");
        if (workTime > 40) {
            System.out.println("正式员工: " + employee.getName() + " 加班:" + (employee.getWorkTime() - 40) + "小时");
        } else if (workTime < 40) {
            System.out.println("正式员工: " + employee.getName() + " 请假: " + (40 - employee.getWorkTime()) + "小时");
        }
    }

    //实现人力部门对临时工的数据访问
    @Override
    public void visit(PartTimeEmployee employee) {
        System.out.println("临时工: " + employee.getName() + " 工作:" + employee.getWorkTime() + "小时");
    }
}
