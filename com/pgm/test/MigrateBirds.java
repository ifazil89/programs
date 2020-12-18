package com.pgm.test;


import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MigrateBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {

        Map<Integer,Integer> map = new HashMap<>();
        arr.stream().forEach(value -> map.put(value , map.containsKey(value) ? map.get(value)+1 :1));

        int[] counter = {0};
        int[] value = {0};
        map.entrySet().stream().forEach(e -> {
                if (e.getValue() > counter[0]) {
                    counter[0] = (e.getValue());
                    value[0] = (e.getKey());
                } else if (e.getValue() == counter[0]
                        && e.getKey() < value[0]) {
                    value[0] = e.getKey();
                }
        });

        return value[0];

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);

System.out.println(result);

        bufferedReader.close();

    }
}
