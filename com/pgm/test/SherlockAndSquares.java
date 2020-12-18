package com.pgm.test;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class SherlockAndSquares {

    static boolean isSquare(int start,int end,int n) {

        // 0-35, 0-17, 0-8, 4-8, 4-6, 5-6, 5-6
            int mid = (start + end) / 2;
            if (n == 1) {
                    return true;
            }
            if (mid == 0 ) {
                    return false;
            }
            if (mid * mid == n) {
                return true;
            }
            if (start == mid +1 && end == mid) {
                    return false;
            }
            else if (mid <= n/2) {
                    if (mid * mid > n) {
                            end = mid;
                    } else if (mid * mid < n){
                            start = mid +1;
                    }
                    return isSquare(start,end,n);
            } else {
                    return false;
            }
            /*for (int i = 2; i <= n / 2; i++) {
                    if (i * i == n) {
                            return true;
                    }
            }*/
    }
    // Complete the squares function below.
    static int squares(int a, int b) {

            int count = 0;
            for (int i = a; i <= b; i++) {
                    if (isSquare(0,i,i)) {
                            System.out.println(i);
                            count++;
                    }
            }
            return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);

            System.out.println(result);
            /*bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();*/
        }

        String word = "hello";


        //bufferedWriter.close();

        scanner.close();
    }
}
