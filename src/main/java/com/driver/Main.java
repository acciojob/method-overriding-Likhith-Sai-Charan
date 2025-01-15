package com.driver;
// Main class to demonstrate the tasks
public class Main {
    public static void main(String[] args) {
       //Task 3:
        //create object of class B and call method meth of class A with it
        // B obj=new B();
       // System.out.println(obj.meth());
        //output: Invoking method from class A
        //Task 5:call this overridden method from obj of class B

        B obj=new B();
        System.out.println(obj.meth());
    }
}
