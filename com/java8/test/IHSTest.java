package com.java8.test;

public class IHSTest {

    static int val = 3;

    static int getValue()
    {
        return val--;
    }

    public static void main(String args[])
    {
        int n;
        for(int i=0; i < 5; i++)
        {
            n = getValue();
            assert n > 2;
            System.out.println(" " + n);
        }
    }
}

