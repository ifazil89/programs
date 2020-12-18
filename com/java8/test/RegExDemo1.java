package com.java8.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {

    public static void main(String[] args) {
        String regEx = "(\\&A;)?(\\&B;)?";
        String input = "Test&A;word&B;change";

        String out = input.replaceAll(regEx,"1");
        System.out.println(out);

        print();
    }

    static void print() {
        Pattern pattern = Pattern.compile(".*(&A;)|(&B;).*");
        Matcher matcher = pattern.matcher("Te&B;st&A;word &B;change");
        while (matcher.find()) {
            System.out.println(matcher.group(1) + ", "+matcher.group(2));
            //System.out.println(matcher.ap);
        }

    }
}
