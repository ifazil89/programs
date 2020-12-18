package com.java8.test.IHSTestPackage;

public class Q7 {


public static void main(String args[])

        {

        StringBuilder b = null;//"hacker";
        b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        System.out.println(b);

        }

}
