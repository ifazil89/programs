package com.pgm.test;


import java.io.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BirthdayChoclate {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {

        AtomicInteger counter =   new AtomicInteger();
        if (s.size() < m) {
            return 0;
        }
        if (s.size() == 1) {
             counter.set(s.get(0) == d ? 1 : 0);
        } else {
            for (int i = 0; i <= s.size() - m; i++) {
                    int sum = 0;
                    for (int j = i; j < (i+m); j++) {
                            sum += s.get(j);
                    }
                    counter.set(sum == d ? counter.incrementAndGet() : counter.intValue());
            }
        }
        return counter.intValue();

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);
        System.out.println(result);

        bufferedReader.close();

    }
}
