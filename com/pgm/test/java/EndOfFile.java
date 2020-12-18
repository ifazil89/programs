package com.pgm.test.java;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<String>();
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            //inputList.add(scanner.nextLine());
            System.out.println(scanner.hasNextLine());
        }
        scanner.close();
        AtomicInteger counter = new AtomicInteger();
        inputList.stream().forEach((e) -> System.out.println(counter.incrementAndGet() +" "+ e));
    }
}