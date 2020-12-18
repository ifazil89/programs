package com.pgm.test;


import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class BrakingRecordMinMax {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {

        int[] minMax = {scores[0], scores[0]};
        //int max = scores[0];

        int[] minMaxCount = {0, 0};
        //int maxCount = 0;

        Arrays.stream(scores).forEach(e -> {
            System.out.println(e + "," +minMaxCount[1]+" - "+minMaxCount[0]);
            if (e > minMax[1]) {
                    minMax[1] = e;
                    minMaxCount[1] += 1;
            } else if (e < minMax[0]) {
                    minMax[0] = e;
                    minMaxCount[0] += 1;
            }

        });

        return new int[]{minMaxCount[1], minMaxCount[0]};
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));
        }


        scanner.close();
    }
}
