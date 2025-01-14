package com.driver.test;

import com.driver.A;
import com.driver.B;

public class TestCases {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth()); // Should print: "Method is overridden in Extended class B"
    }
}
