package com.driver.test;
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}
class B extends A{
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class TestCases {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(new A().meth());
        System.out.println(obj.meth()); // Should print: "Method is overridden in Extended class B"
    }
}
