package com.pgm.test;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ViralAdvertising {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
            /*int cum = 0;
            int init = 5;
            for (int i = 0; i < n; i++) {
                int liked = (init / 2);
                cum += liked;
                init = liked * 3;
            }*/

            int[] cum = {0};
            int[] init = {0};
            IntStream.rangeClosed(1,n).forEach(e -> {
                int liked = init[0] / 2;
                cum[0] += liked;
                init[0] = liked * 3;
            });
            return cum[0];

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

       /* bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        */
       System.out.println(result);

        scanner.close();
    }
}
