package com.interfaces;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating..");
    }

    @Override
    public void slepp() {
        System.out.println("Dog is sleeping..");
    }
}
