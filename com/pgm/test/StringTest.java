package com.pgm.test;

public class StringTest {

    public static void main(String[] args) {
            String s = "Deleveled";

            char[] c = s.toCharArray();
            for (int i = 0;i < s.length()/2; i++) {
                    if (c[i] != c[s.length()-1-i]) {
                            System.out.println("No'");
                    }
            }
            System.out.println("Yes");
     }
}
