package com.pgm.test;

import java.util.*;
import java.io.*;

class Java_Loops_2{


    static String fetchNumbers(int a, int b, int n,int[] result) {
            //(a+2^0.b),(a+2^0.b+2^1.b)
            StringJoiner str = new StringJoiner(" ");

            for (int i = 0; i < n; i++) {
                    int sum = a;
                    for (int j = 0; j <=i ; j++) {
                            if (result[j] == 0) {
                                    //System.out.println(Math.pow(2.0,j));
                                    result[j] = ((int)Math.pow(2.0,j)*b);
                             }
                            sum += result[j];
                            //System.out.println(sum);
                    }
                    str.add(sum+"");
            }
            return str.toString();

    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[][] input = new int[t][3];

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            input[i][0] = a;
            input[i][1] = b;
            input[i][2] = n;
        }

        for (int i=0; i < t ; i++) {
                int[] result = new int[input[i][2]];
                System.out.println(fetchNumbers(input[i][0],input[i][1],input[i][2],result));
        }
        in.close();
    }
}
