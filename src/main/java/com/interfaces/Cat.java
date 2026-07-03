package com.interfaces;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat is eating....");
    }

    @Override
    public void slepp() {
        System.out.println("Cat is sleeping....");
    }
}
