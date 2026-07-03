package com.core;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(20,10);
        System.out.println(rateofinterest());
    }

    void add(int n1, int n2){
        int result = n1 + n2;
        System.out.println("Adition = "+ result);
    }

    static  double rateofinterest() {
        return 10.8;
    }
}
