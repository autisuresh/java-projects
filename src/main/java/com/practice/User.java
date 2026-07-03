package com.practice;

public class User {
    // instance varialbles - created inside class and outside any methods
    // scope availble through out the class
    // also known as globle variable
    // instance variable value is changing from object to object

    String username;
    String password;
    String email;

    //constructor name and class name should be same
    // constructor is same as method but it doesnt have return type
    User(String username, String password, String email){
        // constructor will execute automatically when we create and object
        // called only once when object is created
        // 2 types
        // parameterised and non parameterised/default
        this.username = username;
        this.password = password;
        this.email = email;
        display();
        System.out.println("*********************");
    }
    User() {
        // will print default values
        //
    }

    void setUser(String username, String password, String email) { // local variables
        // local variables are those which are created inside method or  as method parameter
        // this keyword is used to differentiat between local variable and global variable
        // this is used to refer instance variale
        this.username = username;
        this.password = password;
        this.email = email;
    }

    void display() {
        System.out.println(username+" "+password +" "+email);
    }

    public static void main(String[] args) {
        new User("Suresh Auti","test","auti.suresh@gmail.com");
        new User("Shaurya Auti","test","auti.suresh@gmail.com");
        // these object called anonymous object as these done have name

    }
}
