package com.pgm.test;

import java.util.*;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {

        char c = 'z';
        System.out.println((int)c);
        int[] scores = new int[]{100,90,90,80,75,60};

       // Arrays.stream(scores).boxed().distinct().forEach(System.out::println);

        List<Integer> list = Arrays.asList(100,90,80,75,60);

        for(Integer a  : list.subList(0,5)){
                System.out.println(a);
        }


    }

    public static void main_2(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(10);
        set.add(10);
        set.add(2);

        for (int a : set) {
            System.out.println(a);
        }
    }

    public static void main_1(String[] args) {
        String line ="total=10";
        String val = "";
        if (line != null) {
            String format = "total=(\\d*)";
            Pattern pattern = Pattern.compile(format);
            Matcher matcher =  pattern.matcher(line);
            //System.out.println(matcher.group());
            if (matcher.find()) {
                System.out.println("trur");
                val = matcher.group(1);
            }
        }

        System.out.println(val
        );
    }
}
