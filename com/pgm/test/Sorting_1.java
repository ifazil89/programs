package com.pgm.test;

import java.util.Arrays;
import java.util.function.Consumer;

public class Sorting_1 {

    public static void main(String[] args) {
            int[] a = {9,4,6,2,18,5,1,7,9,32,21,46,25};
            Arrays.stream(a).forEach(System.out::print);

            System.out.println();

            Arrays.stream(sortNormal(a)).forEach(System.out::print);

    }

    private static int[] sortNormal(int a[]) {

            int total=0;

            for (int i=0; i < a.length; i++) {
                //System.out.println("i:"+(i+1));
                int c = 0;
                for (int j=i+1; j < a.length; j++) {
                    c++;
                    if (a[i] > a[j]) {
                        int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
                total = total + (i+1)*c;
                System.out.println("j:"+c);
            }

            System.out.println("total:"+total);
            return a;
    }
}
