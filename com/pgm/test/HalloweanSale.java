package com.pgm.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HalloweanSale {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {

        int sum = 0;
        int count = 0;
        while (sum <= s) {
            int discountPrice = p - (count * d);
            discountPrice = discountPrice > m ? discountPrice : m;
            sum +=discountPrice;
            count++;
        }
        return count -1 ;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);
        System.out.println("result: "+answer);
/*

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();
*/

        scanner.close();
    }
}
