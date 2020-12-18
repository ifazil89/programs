package com.pgm.test;

import java.util.HashMap;
import java.util.Scanner;

public class FindWinner_HackerEarth {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int T = Integer.parseInt(s.nextLine());

        String[] inputs = new String[T];
        for (int i=0; i < T; i++) {
            inputs[i] = s.nextLine();
        }

        String[] input = null;
        for (int i=0; i < T; i++) {
            input = inputs[i].split(" ");


            Long first = (Long.parseLong(input[0]) / Long.parseLong(input[1])) % 2; //0 or 1 => 0 -> Disahnt , 1-> Arpa
            Long second = Long.parseLong(input[0]) % Long.parseLong(input[1]);

            if (second > 0) {
                System.out.println(first == 1 ? "Dishant" : "Arpa");
            } else {
                System.out.println(first == 0 ? "Dishant" : "Arpa");
            }


        }

    }
}
