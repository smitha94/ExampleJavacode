package com.company;

public class Deer extends Animal {

    public Deer(String name, int age) {
        super(name, age);
    }

    @Override
    public void setAge(int age) {
        this.age = age;
        System.out.println("I AM OLLLDD");
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void whoIam() {
        {
            System.out.println(" I am dear ");
        }
    }
}