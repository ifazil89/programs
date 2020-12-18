package com.java8.test;

public class Outer {

    static int val = 30;
    static class AInner {
        int a;
        {
            System.out.println("Ainner"+val);
        }


    }

    static class BInner {
        int b;
        {
            System.out.println("BInner"+val);
        }
    }

    static class CInner {
        int c;
        {
            System.out.println("CInner"+val);
        }
    }


}
