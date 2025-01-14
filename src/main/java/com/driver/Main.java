package com.driver;
// Task 1: Create a class A
class A {
    // Method named meth
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create a class B which extends class A
class B extends A {
    // Task 4: Override method meth of class A in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

// Main class to demonstrate the tasks
public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A
        B objB = new B();
        System.out.println(objB.meth()); // Calls the overridden method in class B
    }
}
