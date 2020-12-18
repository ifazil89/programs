package com.java8.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamDemo {

    public static void main(String[] args) {
        List<Integer> l= IntStream.range(1,11).boxed().filter(e-> (e  & 1) == 1).collect(Collectors.toList());
        l.stream().forEach(System.out::println);
    }
}
