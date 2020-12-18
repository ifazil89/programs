package com.pgm.test;

import javax.sql.rowset.spi.SyncResolver;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class BeautifulDaysMovieCount {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

        int count = 0;
        StringBuffer buf ;
        for (; i<= j; i++) {
            buf =  new StringBuffer();
            buf.append(i);
            int reverseI = Integer.parseInt(buf.reverse().toString());
            System.out.println(i+" , "+Math.abs(i - reverseI));
            System.out.println((Math.abs(i - reverseI) % k));
            if ((Math.abs(i - reverseI) % k) == 0){
                count++;
            }
        }
        return count;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        System.out.println(result);
        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}

