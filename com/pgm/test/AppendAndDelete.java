package com.pgm.test;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class AppendAndDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {

            //hackerhappy  hackerrank 9
        //abcdef
        //fedcba
        //15
            if ((s.equalsIgnoreCase(t) && (k % 2 == 0 || k > s.length()+t.length()))
                    || s.length() + t.length() <= k) {
                return "Yes";
            }

            int count = 1;
            String tmpString=s.substring(0,s.length()-count);
            while (tmpString.length() > 0 && count < k) {
                    if (t.indexOf(tmpString) == 0) {
                            int computLength = count + t.length()-tmpString.length();
                            if (computLength == k) {
                                    return "Yes";
                            } /*else if (computLength > k && (computLength - k)%2 == 0) {
                                    return "Yes";
                            }*/ else if ((t.length()-tmpString.length()) == 0) {
                                    return "Yes";
                            }else {
                                    return "No";
                            }
                    }
                    count++;
                    tmpString=s.substring(0,s.length()-count);
            }
            if ((tmpString.length() == 0 && (k-count) > t.length())) {
                    return "Yes";
            }

            return "No";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);
        System.out.println(result);
/*
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
