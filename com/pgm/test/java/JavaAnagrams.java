package com.pgm.test.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length()) {
            return false;
        }
        Map<Character,Integer> trackMap = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (trackMap.containsKey(ch)) {
                continue;
            }
            int aCharCount = 1;
            int currenIndex = i;
            while (a.indexOf(ch, currenIndex +1) >= 0) {
                currenIndex = a.indexOf(ch, currenIndex +1);
                aCharCount++;
            }
            currenIndex = -1;
            int bCharCount = 0;
            while (b.indexOf(ch, currenIndex +1) >= 0) {
                currenIndex = b.indexOf(ch, currenIndex +1);
                bCharCount++;
            }

            if (aCharCount != bCharCount) {
                return false;
            }
            trackMap.put(ch,aCharCount);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
