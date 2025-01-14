package com.driver;

// Main class to demonstrate the tasks
public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A
        B objB = new B();
        System.out.println(objB.meth()); // Calls the overridden method in class B
    }
}
