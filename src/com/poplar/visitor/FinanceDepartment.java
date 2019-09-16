package com.poplar.visitor;

/**
 * Created By poplar on 2019/9/16
 * 财务部
 */
public class FinanceDepartment extends Department {
    @Override
    public void visit(FullTimeEmployee employee) {
        Double salary = employee.getSalary();
        int workTime = employee.getWorkTime();
        if (workTime > 40) {
            salary = salary + (workTime - 40) * 100;
        } else if (workTime < 40) {
            salary = salary - (40 - workTime) * 80;
            if (salary == 0) {
                salary = 0D;
            }
        }
        System.out.println("正式员工: " + employee.getName() + " 薪水: " + salary);
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        System.out.println("临时工: "+employee.getName() + ", 薪水: " + employee.getWorkTime() * employee.getHoursSalary());
    }
}
