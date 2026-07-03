package com.interfaces;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.slepp();
        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);
    }
}
