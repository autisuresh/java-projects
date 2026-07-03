package com.innerclasses;

public class Test {
    public static void main(String[] args) {
        // create and instance wiht the help of object.
        Car car = new Car("Tata");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
    }
}
