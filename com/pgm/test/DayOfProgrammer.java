package com.pgm.test;

import java.io.*;

public class DayOfProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

        return String.format("%d.09.%d",(year == 1918) ? (12 + 14 ): isLeapYear(year) ? 12 : 13, year);

    }

    private  static boolean isLeapYear(int year) {
            if (year <= 1918) {
                return (year % 4 == 0);
            } else {
                return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 > 0));
            }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);
        System.out.println(result);

        bufferedReader.close();
    }
}
