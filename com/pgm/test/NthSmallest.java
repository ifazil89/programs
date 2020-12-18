package com.pgm.test;

import java.util.Arrays;
import java.util.function.Predicate;

public class NthSmallest {

    public static void main(String[] args) {
        int[] inputs = {9,4,6,2,18,5};

        System.out.println("1st Smallest: "+firstSmallest(inputs));
        System.out.println("2nd Smallest: "+secondSmallest(inputs));

        int i = 0;
        int total = 0;

        System.out.println("Nth Smallest(4): "+nthSmallest_BruteForce(inputs,5,inputs.length,i,total,true));


    }

    private static  int firstSmallest(int[] inputs){
            int min = inputs[0];
            for (int i=1; i < inputs.length; i++) {
                if (inputs[i] < min) {
                    min = inputs[i];
                }
            }

            return min;
    }
    //[6,4,9,2,18,5]
    private static  int secondSmallest(int[] inputs) {
        int min_1 = inputs[0];
        int min_2 = inputs[1];
        int min_3 = inputs[2];

        for (int i=0; i < inputs.length; i++) {
            if (inputs[i] < min_1) {
                min_3 = min_2;
                min_2 = min_1;
                min_1 = inputs[i];
            }else if (inputs[i] < min_2) {
                min_3 = min_2;
                min_2 = inputs[i];
            }else if (min_3 > inputs[i]) {
                min_3 = inputs[i];
            }
        }
        return min_2;
    }


    //[6,4,9,2,18,5]  [6,4,9,2,18],  
    private static int nthSmallest_BruteForce(int inputs[],int n,int count,int inc, int total,boolean init) {

        if (count==n && !init) {
            return inputs[n-1];
        }

        //System.out.println("-------\ncount: "+count+" , n: "+n+" , mid: "+inputs[count/2]);
        //System.out.println(Arrays.toString(inputs)+"\n----------");
        int[] leftArray = new int[count];
        int[] rightArray = new int[count];
        int leftCount  = 0;
        int rightCount = 0;

        int midValue = inputs[n-1];

        inc =+1 ;
        int j = 0;

        for (int i=0; i < count; i++) {
            j++;
                if (inputs[i] < midValue) {
                    leftArray[leftCount] = inputs[i];
                    leftCount++;
                } else if (inputs[i] > midValue){
                    rightArray[rightCount] = inputs[i];
                    rightCount++;
                }
        }

        total += inc*j;
        leftArray[leftCount] = midValue;
        leftCount++;
        System.out.println("total: " +total);
        if (n <= leftCount) {
            return nthSmallest_BruteForce(leftArray,n,leftCount,inc,total,false);
        } else {
            return nthSmallest_BruteForce(rightArray,(n-leftCount),rightCount,inc,total,false);
        }

    }
}
