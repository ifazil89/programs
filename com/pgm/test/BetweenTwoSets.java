package com.pgm.test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class BetweenTwoSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    private static boolean isDivideList(List<Integer> a, int num) {

        for (int i = 0; i < a.size(); i++) {
            if ( num % a.get(i) > 0) {
                return false;
            }
        }
        return true;
    }
    private static boolean isDivideNum(List<Integer> a, int num) {


        for (int i = 0; i < a.size(); i++) {
            if ( a.get(i) % num > 0) {
                return false;
            }
        }
        return true;
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here

        List<Integer> c = new ArrayList<>();
        IntStream.rangeClosed(a.get(a.size() - 1), b.get(0) / 2).filter(i -> isDivideList(a,i)).forEach(i -> c.add(i));
        if ( isDivideList(a, b.get(0))) {
            c.add(b.get(0));
        }

        c.forEach(i -> System.out.println(i));
        long count = c.stream().filter(i -> isDivideNum(b , i)).count();

        return (int)count;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = getTotalX(arr, brr);

        System.out.println(total);

        bufferedReader.close();

    }
}
