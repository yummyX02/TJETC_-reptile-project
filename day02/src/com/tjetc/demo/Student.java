package com.tjetc.demo;

public class Student extends Object{
    private String name;
    private String stuId;

    public String getStuId() {
        return stuId;
    }

    private int age;

    public Student(String name, String stuId, int age) {
        this.name = name;
        this.stuId = stuId;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + stuId + '\'' +
                '}';
    }
}