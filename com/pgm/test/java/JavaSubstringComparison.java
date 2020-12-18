package com.pgm.test.java;


import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Stream;

public class JavaSubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        Set<String> subsrtingSet = new TreeSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            subsrtingSet.add(s.substring(i , i + k));
        }
       List<String>  resultList = new ArrayList<>();
        resultList.addAll(subsrtingSet);
        smallest = resultList.get(0);
        largest = resultList.get(resultList.size() - 1);

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
