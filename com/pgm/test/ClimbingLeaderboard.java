package com.pgm.test;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {

    static int getPosition(List<Integer> scoreList, int score,int pos) {

            if (score >= scoreList.get(0)) {
                return pos + 1;
            } else if (score < scoreList.get(scoreList.size()-1)) {
                return pos + scoreList.size()+1;
            }else if (score == scoreList.get(scoreList.size()-1)) {
                return pos + scoreList.size();
            } else {
                int mid = scoreList.size() / 2;
                if (score == scoreList.get(mid)) {
                        return pos + mid + 1;
                } else if (score < scoreList.get(mid)){
                        return getPosition(scoreList.subList(mid+1,scoreList.size()),score,pos + mid+1);
                } else {
                        return getPosition(scoreList.subList(0,mid),score,pos);
                }
            }
        //100,90,80,75,60 - 65

    }

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
            int[] posArray = new int[alice.length];


            List<Integer> scoreList = Arrays.stream(scores).boxed().distinct().collect(Collectors.toList());

            for (int i = 0; i < alice.length; i++) {
                    posArray[i] = getPosition(scoreList,alice[i],0);
            }
            return posArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            //bufferedWriter.write(String.valueOf(result[i]));
            System.out.println(result[i]);
            //if (i != result.length - 1) {
            //    bufferedWriter.write("\n");
            //}
        }

        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
