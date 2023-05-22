package com.tjetc.day01;

public class Student {
//    学生姓名
    String stu_name;
//    学生学号
    String stu_id;
//    学生专业
    String stu_dept;
//    学生绩点
    double stu_gpa;
//    学生班级
    int stu_class;
//  含参构造函数
    public Student(String name,String id,String dept,double gpa,int num){
        stu_class = num;
        stu_gpa = gpa;
        stu_id = id;
        stu_dept = dept;
        stu_name = name;
    }
//    行为函数
    public double getStu_gpa(){
        return stu_gpa;
    }
//    主函数
    public static void main(String[] args){
        Student stu = new Student("王翔","20212896","数据科学与大数据技术",3.8,2);
        double gpa = stu.getStu_gpa();
        System.out.println(gpa);
    }
}
