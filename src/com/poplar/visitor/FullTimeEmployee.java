package com.poplar.visitor;

/**
 * Created By poplar on 2019/9/16
 * 正式员工
 */
public class FullTimeEmployee implements IEmployee {
    /*姓名*/
    private String name;
    /*工资*/
    private Double salary;
    /*工时*/
    private int workTime;

    public FullTimeEmployee(String name, Double salary, int workTime) {
        this.name = name;
        this.salary = salary;
        this.workTime = workTime;
    }

    @Override
    public void accept(Department department) {

        department.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
