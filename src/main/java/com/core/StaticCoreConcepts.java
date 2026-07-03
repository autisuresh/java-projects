package com.core;

public class StaticCoreConcepts {
    static {
        System.out.println("INDIA");
    }
    public static void main(String[] args) {
        StaticCoreConcepts staticCoreConcepts = new StaticCoreConcepts();
        get();
        System.out.println("WELCOME ...!!!");
        staticCoreConcepts.show();
    }

    static void get(){
        System.out.println("get something..");
    }

    void show(){
        System.out.println("BHARAT..");
    }
    static {
        System.out.println("Full stack developer ..");
    }
}
