package com.pgm.test;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntSupplier;

public class CutTheSticks {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {

        List<Integer> resultList = findCutCount(arr,new ArrayList<>());
        System.out.println(resultList);
        return resultList.stream().mapToInt(i -> i).toArray();
    }


    static List<Integer> findCutCount(int[] arr,List<Integer> resultList) {

        int min = Arrays.stream(arr).filter(e -> e > 0).min().orElse(0);
        if (min == 0 )  {
            return resultList;
        }
        int counter = 0;
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    counter++;
                    newArray[i] = arr[i] - min;
                }else {
                    newArray[i] = 0;
                }
        }
        resultList.add(counter);

        Arrays.stream(newArray).forEach(e->System.out.print(e+" , "));
        System.out.println();
        return findCutCount(newArray,resultList);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);
        System.out.println(result.toString());

        for (int i = 0; i < result.length; i++) {
            //bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                //bufferedWriter.write("\n");
            }
        }

       // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
