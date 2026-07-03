package com.core;

public class VariableBaiscs {

    int empId = 123; // global variable
    static String empName = "Shaw"; // static variable

    public static void main(String[] args) {
        VariableBaiscs baiscs = new VariableBaiscs();
        baiscs.show();
    }

    void show() {
        double empSalary = 15000; // local variable
        System.out.println("\n empId "+empId + "\n empName "+ empName + "\n empSalary "+ empSalary);
    }
}
