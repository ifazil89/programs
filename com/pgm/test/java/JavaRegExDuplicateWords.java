package com.pgm.test.java;

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegExDuplicateWords {

    public static void main(String[] args) {

        String regex = "(\\b\\w+\\b)\\s\\1";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        int count= 0 ;

        while (numSentences-- > 0) {
            StringBuffer output1 = new StringBuffer();
            StringJoiner output = new StringJoiner(" ");
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                System.out.println(m.group()+" - "+m.group(1));
                //System.out.println(m.start());
                //System.out.println(m.end());
                //output.add(m.group());
                input = input.replaceAll(m.group(),m.group(1));
                //m = p.matcher(input);
            }
            System.out.println(input);
            // Prints the modified sentence.

        }

        in.close();
    }
}