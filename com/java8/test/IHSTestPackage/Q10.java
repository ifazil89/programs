package com.java8.test.IHSTestPackage;


import java.util.*;

class Q10
{
    public static void main(String args[])
    {
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(4.0);
        vals.add(16.0);
        Spliterator<Double> spltitr = vals.spliterator();
        while(spltitr.tryAdvance((n) -> System.out.print(" "+n)));
        System.out.println();
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.print(" "+n));
    }
}