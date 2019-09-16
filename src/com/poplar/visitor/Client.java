package com.poplar.visitor;

/**
 * Created By poplar on 2019/9/16
 */
public class Client {
    /**
     * Background：M公司开发部想要为某企业开发一个OA系统，在该OA系统中包含一个员工信息管理子系统，该企业包括正式员工和临时工，
     * 每周HR部门和财务部等部门需要对员工数据进行汇总，汇总数据包括员工工作时间、员工工资等等。该企业的基本制度如下：
     * <p>
     * （1）正式员工（Full time Employee）每周工作时间为40小时，不同级别、不同部门的员工每周基本工资不同；如果超过40小时，
     * 超出部分按照100元/小时作为加班费；如果少于40小时，所缺时间按照请假处理，请假锁扣工资以80元/小时计算，直到基本工资扣除到0为止。
     * 除了记录实际工作时间外，HR部需要记录加班时长或请假时长，作为员工平时表现的一项依据。
     * <p>
     * （2）临时员工（Part time Employee）每周工作时间不固定，基本工资按照小时计算，不同岗位的临时工小时工资不同。HR部只需要记录实际工作时间。
     * HR人力资源部和财务部工作人员可以根据各自的需要对员工数据进行汇总处理，HR人力资源部负责汇总每周员工工作时间，而财务部负责计算每周员工工资。
     */
    public static void main(String[] args) {

        EmployeeList empList = new EmployeeList();
        IEmployee fteA = new FullTimeEmployee("梁思成", 3200.00, 45);
        IEmployee fteB = new FullTimeEmployee("徐志摩", 2000D, 40);
        IEmployee fteC = new FullTimeEmployee("梁徽因", 2400D, 38);
        IEmployee fteD = new PartTimeEmployee("方鸿渐", 80D, 20);
        IEmployee fteE = new PartTimeEmployee("唐宛如", 60D, 18);

        empList.attach(fteA);
        empList.attach(fteB);
        empList.attach(fteC);
        empList.attach(fteD);
        empList.attach(fteE);

        Department hr = new HRDepartment();
        hr.visit((FullTimeEmployee) fteA);

        Department finance = new FinanceDepartment();
        finance.visit((PartTimeEmployee) fteE);


    }
}
