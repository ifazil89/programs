package com.java8.test;

public class DefaultMethInterface {

    public static void main(String[] args) {
        DefaultImplemented obj = new DefaultImplemented();
        obj.method_1();

    }
}

class DefaultImplemented implements  DefaultInterface_1 {

        public void defaultMethdCall () {
            method_1();
        }
}

interface  DefaultInterface_1 {

    default  void method_1 () {
            System.out.println("Default Interface 1 : method_1");
    }
}

interface  DefaultInterface_2 {

    default  void method_1 () {
        System.out.println("Default Interface 2 : method_1");
    }
}