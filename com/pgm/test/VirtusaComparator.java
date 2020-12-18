package com.pgm.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class VirtusaComparatorPlayer {
    String name;
    int score;

    VirtusaComparatorPlayer(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class VirtusaComparatorChecker implements Comparator<VirtusaComparatorPlayer> {
    // complete this method
    public int compare(VirtusaComparatorPlayer a, VirtusaComparatorPlayer b) {
        return a.score - b.score != 0 ? (b.score - a.score) :  (a.name.compareTo(b.name));
    }
}


public class VirtusaComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        VirtusaComparatorPlayer[] player = new VirtusaComparatorPlayer[n];
        VirtusaComparatorChecker checker = new VirtusaComparatorChecker();

        for(int i = 0; i < n; i++){
            player[i] = new VirtusaComparatorPlayer(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}