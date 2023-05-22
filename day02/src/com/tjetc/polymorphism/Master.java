package com.tjetc.polymorphism;

public class Master {
    public void run(Dog dog){
        dog.run();
    }
    public void run(Cat cat){
        cat.run();
    }
    public void run(Pet pet){
        pet.run();
    }
}
