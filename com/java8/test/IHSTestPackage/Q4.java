package com.java8.test.IHSTestPackage;


class Q4A{

    public int x;

    protected int y;

    void cal(int a, int b){

        x =  a + 1;

        y =  b;

    }

}

class Q4 {

    public static void main(String args[])

    {

        Q4A obj = new Q4A();

        obj.cal(2, 3);

        System.out.println(obj.x + " " + obj.y);

    }

}