package com.poplar.visitor;

/**
 * Created By poplar on 2019/9/16
 * 兼职临时工
 */
public class PartTimeEmployee implements IEmployee {

    /*姓名*/
    private String name;
    /*工资*/
    private Double hoursSalary;
    /*工时*/
    private int workTime;

    public PartTimeEmployee(String name, Double hoursSalary, int workTime) {
        this.name = name;
        this.hoursSalary = hoursSalary;
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

    public Double getHoursSalary() {
        return hoursSalary;
    }

    public void setHoursSalary(Double hoursSalary) {
        this.hoursSalary = hoursSalary;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
