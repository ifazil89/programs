package com.pgm.test;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class ExtraLongFactorial {

    static BigInteger getFactorial(int n) {

            if (n ==1) {
                    return BigInteger.valueOf(1);
            }
            if (n ==0) {
                return BigInteger.valueOf(1);
            }
            return BigInteger.valueOf(n).multiply(getFactorial(n-1));
    }
    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {

        System.out.println(getFactorial(n));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
