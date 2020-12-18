package com.pgm.test.java;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Pattern pattern = Pattern.compile("([a-zA-Z]+)");
        Matcher match = pattern.matcher(s);
        List<String> wordList = new ArrayList<>();
        while(match.find()) {
            wordList.add(match.group(0));
        }
        System.out.println(wordList.size());
        wordList.stream().forEach(System.out::println);

        scan.close();
    }
}

