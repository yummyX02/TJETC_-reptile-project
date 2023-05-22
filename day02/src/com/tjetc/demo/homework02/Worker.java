package com.tjetc.demo.homework02;

import com.tjetc.demo.homework02.Employee;

// 普通员工
public class Worker extends Employee {
    public Worker() {
    }

    public Worker(String name, double monthSalary) {
        super(name, monthSalary);// 操作的都是Employee里面的内容,只能继承非私有属性
    }

    public void work(){
        System.out.println("员工：" + getName() + "正在工作");

    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
