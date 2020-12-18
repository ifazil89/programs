package com.pgm.test;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SequenceEquation {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            //result [i] = p[p[p[p[i] - 1] - 1] - 1];
            result [i] = getY(i + 1 ,i + 1,p);
        }
        return result;

    }

    static int getY (int x,int initX,int[] p) {
        if (p[p[x - 1] - 1] == initX) {
            return x;
        }
        return  getY(p[p[x -1] -1], initX,p);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            //bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                //bufferedWriter.write("\n");
            }
        }

       // bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
