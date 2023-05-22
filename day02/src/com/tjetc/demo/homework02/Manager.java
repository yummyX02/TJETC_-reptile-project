package com.tjetc.demo.homework02;

import com.tjetc.demo.homework02.Employee;

// 经理类
public class Manager extends Employee {
    private double bonus;//经历的奖金
    public void manage(){
        System.out.println("经理：" + getName() + "正在管理");
    }

    public Manager() {}

    public Manager(String name, double monthSalary, double bonus) {
        super(name, monthSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    @Override
    public double getAnnual(){
        return super.getAnnual()+bonus;
    }
}
