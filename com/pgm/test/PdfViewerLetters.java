package com.pgm.test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PdfViewerLetters {


    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {

            int maxHeight = 1;
            char[] charArray = word.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                    int hIndex = ((int)charArray[i] - 97);
                    if (h[hIndex] > maxHeight) {
                            maxHeight = h[hIndex];
                    }
            }

            return maxHeight * charArray.length;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
