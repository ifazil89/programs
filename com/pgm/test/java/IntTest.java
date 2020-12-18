package com.pgm.test.java;

public class IntTest {
    public static void main(String[] args) {

        Integer a = Integer. valueOf("122");
        Integer b = Integer. valueOf("122");

        System.out.println(a == b);
        System.out.println(b.equals(a));

    }
}
