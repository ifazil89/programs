package com.pgm.test.java;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class JavaRegExIPValidate{

    public static void main1(String[] args){
        Scanner in = new Scanner(System.in);
        String pattern = "[0-255]{1,3}\\.[0-255]{1,3}\\.[0-255]{1,3}\\.[0-255]{1,3}";

        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(pattern) ? "match" : "not match");
        }

    }

    public static void main(String[] args) {
        int matches = runTest(
                "([0-2]{0,1}[[]])", "Two Uppercase alphabets 87 overall");
        System.out.println(matches);
    }
    public static int runTest(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        return matches;
    }
}

//Write your code here