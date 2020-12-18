package com.pgm.test;

import java.util.Scanner;

public class ABCsKthString {

    static String fetchKthStringPortion(int k, int s, int t) {
        String str = "ABC";
        String outString = getKLevelString(new StringBuilder().append(str), k, 1);
        //System.out.println(outString);
        return outString.substring(s-1, t);
    }

    static String getKLevelString(StringBuilder inputStringBuf,int k, int counter) {

        System.out.println(k+" - "+inputStringBuf+" - "+counter);
        if (k == 1) {
            return "ABC";
        }
        if (counter == k) {
            return inputStringBuf.toString();
        }
        //char[] stringArray = inputString.toCharArray();
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < inputStringBuf.length() - 1; i++) {
            if (inputStringBuf.length() < Integer.MAX_VALUE - 999) {
                buffer.append(inputStringBuf.charAt(i));
                buffer.append(inputStringBuf);
            }

        }
        buffer.append(inputStringBuf.charAt(inputStringBuf.length() - 1));
        return getKLevelString(buffer, k , ++counter);

    }

    public static void main(String[] args) {

        /*long c = 0;
        StringBuilder build = new StringBuilder();
        //System.out.println("START: ");
        build.append("START:");
        while (true) {
            //System.out.println("c-: "+build.length());
            //System.gc();
            build.append("A");
            if (c == 999999999l) {
                build.append("C");
                break;
            }
            c++;
        }
        c = 0;
        while (true) {
            //System.out.println("c-: "+build.length());
            //System.gc();
            build.append("B");
            if (c == 99999l) {
                build.append("E");
                break;
            }
            c++;
        }
        System.out.println("Finished...");
        System.out.println(build.toString());
        System.exit(0);*/
        Scanner scanner = new Scanner(System.in);

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] inputs = new int[arrItems.length];
        for (int i = 0; i < arrItems.length; i++) {
            inputs[i] = Integer.parseInt(arrItems[i]);
        }

        String result = fetchKthStringPortion(inputs[0], inputs[1],inputs[2]);
        System.out.println("Result: "+result);

    }
}
