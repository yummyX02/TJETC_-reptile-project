package com.tjetc.demo.homework02;
//.定义员工类Employee,包含姓名和月工资，以及计算年工资getAnnual的方法.
public class Employee {
    private String name;
    private double monthSalary;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public Employee(String name, double monthSalary) {
        this.name = name;
        this.monthSalary = monthSalary;
    }

    public double getAnnual(){
        return (monthSalary*12);
    }
}
