package com.pgm.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveThePrisoner {

    // Complete the saveThePrisoner function below.
    //n : the number of prisoners
    //m: the number of sweets
    //s : the chair number to start passing out treats at
    static int saveThePrisoner(int n, int m, int s) {

        if (m <= n) {
            return s;
        }
        int reminder = m % n;
        if (reminder == 0) {
            return s == 1 ? n : s-1;
        } else {
            int index = (s + reminder) - 1;
            if (index <= n) {
                return  index;
            } else {
                return index -  n;
            }

        }

        /*if (m + s <= n) {
            return m + s -1;
        }
        int r = m % n;
        System.out.println("r: "+r);
        if (r == 0) {
            return (s - 1) == 0 ? m : (s - 1);

        } else {
            if ((r + s - 1) <= n) {
                return r + s -1;
            }
            return r - ((n - s) +1 ) ;
        }*/

        /*if ((m+s-1) <= n) {
            return (m+s-1);
        }

        int remaining = ((m%n)+s-1);
        if (remaining+s-1 <= n) {
            return remaining+s-1;
        }
        return n - (remaining + s);*/

        //return saveThePrisoner(n, r,s);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        ArrayList resultList = new ArrayList();

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nms[0]);

            int m = Integer.parseInt(nms[1]);

            int s = Integer.parseInt(nms[2]);

            int result = saveThePrisoner(n, m, s);
            //System.out.println("result: "+result);
            resultList.add("result: "+result);

           // bufferedWriter.write(String.valueOf(result));
           // bufferedWriter.newLine();
        }

       // bufferedWriter.close();
        resultList.stream().forEach(e -> System.out.println(e));

        scanner.close();
    }
}
