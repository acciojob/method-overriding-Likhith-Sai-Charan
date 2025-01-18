package com.driver;
//Task 2:
//create a class B which extends class A
public class B extends A {
    @Override
    //Task 4:Now override methode meth of class A in class B, which returns the following string "Method is overridden in Extendend class B"
    public String meth() {
        return "Method is overridden in Extendend class B";
    }
}