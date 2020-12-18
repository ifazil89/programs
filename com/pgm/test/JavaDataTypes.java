package com.pgm.test;

import java.util.*;
import java.io.*;



class JavaDataTypes{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.skip("[\\r\\n]");
        String[] input = new String[t];
        for(int i=0;i<t;i++)
        {
            input[i] = sc.nextLine();
            //sc.skip("[\\r\\n]");
        }

        for (int i = 0; i < t; i++) {
            try
            {
                long x = Long.valueOf(input[i]);
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-9223372036854775808l  && x<=9223372036854775807l)System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(input[i]+" can't be fitted anywhere.");
            }
        }
    }
}



