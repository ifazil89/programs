package com.java8.test;

public class OuterTest {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer.AInner a1 = new Outer.AInner();
        a1.a = 1;
    }
}
