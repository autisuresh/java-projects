package com.core;

public class AutoboxingConcept {
    public static void main(String[] args) {
        // autoboxing - primitive to wrapper class
        int empId = 121;
        Integer employeeId = empId;
        System.out.println(employeeId);

        // Unboxing
        Double productPrice = 2255.5;
        double pprice = productPrice;
        System.out.println(pprice);
    }
}
