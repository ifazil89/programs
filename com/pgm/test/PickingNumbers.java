package com.pgm.test;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class PickingNumbers {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {

        int maxCount = 0;
        List<List<Integer>> numberList = new ArrayList<>();
        for (int i = 0; i < a.size() - 1; i++) {
            List<Integer> countList = new ArrayList<>();
            countList.add(a.get(i));
            for (int j = 0; j < a.size(); j++) {
                if (i != j) {
                    if (Math.abs(a.get(i) - a.get(j)) <= 1) {
                        countList.add(a.get(j));
                    }
                }
            }
            numberList.add(countList);
        }

        for (List<Integer> l : numberList) {
            System.out.println(l);
            boolean isValid = true;
            for (int i = 0; i < l.size(); i++) {
                List<Integer> localList = new ArrayList<>();
                localList.add(l.get(i));
                for (int j = i+1; j < l.size(); j++) {
                    //if (Math.abs(l.get(i) - l.get(j)) <= 1) {
                        //isValid = false;
                        //break;
                    //   localList.add(l.get(j));
                    //}
                    if (isValid(localList,l.get(j))) {
                        localList.add(l.get(j));
                    }
                }
                if (maxCount < localList.size()) {
                    System.out.println(localList+" , "+l);
                    maxCount = localList.size();
                }
            }
            //if (isValid) {

            //}
        }
        return maxCount;
    }
    public static int pickingNumbers1(List<Integer> a) {

        int maxCount = 0;
        /*for (int i = 0; i < a.size(); i++) {
                int count = 1;
                System.out.print("\n"+a.get(i));
                for (int j = i + 1; j < a.size(); j++) {
                        if (Math.abs(a.get(i) - a.get(j)) <= 1) {
                            count ++;
                            System.out.print(a.get(j));
                        }
                }
                if (maxCount < count) {
                    maxCount = count;
                }
        }*/
    //4 6 5 3 3 1 -
        //List<Integer> addedList = new ArrayList<>();
        //List<Integer> remainingList = new ArrayList<>();
        for (int i = 0; i < a.size() - 1; i++) {
            List<Integer> addedList = new ArrayList<>();
            System.out.print("\n"+a.get(i)+"\n");
            addedList.add(a.get(i));
            int lastJ = 0;
            for (int j = i+1; j < a.size(); j++) {
                System.out.println("j:- "+a.get(j)+" , addedList: "+addedList);
                if (isValid(addedList, a.get(j))) {
                    addedList.add(a.get(j));
                } /*else {
                    if (lastJ != j) {
                        lastJ = j;
                        j--;
                    }
                    if (maxCount < addedList.size()) {
                        maxCount = addedList.size();
                    }
                    addedList = new ArrayList<>();
                    addedList.add(a.get(i));
                }*/
            }

            if (maxCount < addedList.size()) {
                maxCount = addedList.size();
            }
        }

        return maxCount;
    }

    static boolean isValid (List<Integer> a, Integer curValue) {
        //System.out.println("a size:- "+a.size() + " cur val: "+curValue);
        for (Integer i: a) {
            //System.out.print(i+" - ");
            if (Math.abs(i - curValue) > 1) {
                return  false;
            }
        }
        return true;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = pickingNumbers(a);
        System.out.println("result: "+result);
        bufferedReader.close();
    }
}
