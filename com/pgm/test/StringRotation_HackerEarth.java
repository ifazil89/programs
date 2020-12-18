package com.pgm.test;

import java.util.Scanner;

public class StringRotation_HackerEarth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String S = scanner.nextLine();
        String T = scanner.nextLine();

        System.out.println(T.substring(1,1).length());

        String temp = S;
        String remaining = "";
        while (temp.length() > 0){
            if (T.indexOf(temp) >= 0) {
                    System.out.println("index: "+T.indexOf(temp));
                    break;
            }
            remaining += temp.charAt(0);
            temp = temp.substring(1,temp.length());
        }

        System.out.println(remaining.length());

        System.out.println("finished...");
    }


}
