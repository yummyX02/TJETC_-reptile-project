package com.tjetc.demo.homework02;

public class TestDemo {
    public void showEmpAnnual(Employee e){
        System.out.println(e.getName() + "的年薪是：" + e.getAnnual());
    }
    public static void main(String[] args){
        System.out.println("查找张三和李四的年薪是多少");
        Employee worker = new Worker("张三",3500);
        Manager manager = new Manager("李四",12000,5000);
        TestDemo testDemo = new TestDemo();
        testDemo.showEmpAnnual(worker);
        testDemo.showEmpAnnual(manager);
    }
}
