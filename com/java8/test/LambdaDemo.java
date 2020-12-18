package com.java8.test;

public class LambdaDemo {

    public static void main(String[] args) {

        TestFuncInt testFuncInt = new TestFuncInt() {
            @Override
            public int getDefaultValue() {
                return 1;
            }
        };

        System.out.println(testFuncInt);
        System.out.println(testFuncInt.getDefaultValue());

        TestFuncInt testFuncInt1 = () -> 2;

        System.out.println(testFuncInt1);
        System.out.println(testFuncInt1.getDefaultValue());

    }
}


interface TestFuncInt{

    int getDefaultValue();
}
