package com.ds.list.sl;

public class SingleLinkedListMain {

    public static void main (String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(2,20);
        list.traverse();
        int index = list.getIndex(60);
        System.out.println(index);
        int element = list.get(2);
        System.out.println(element);

        list.delete(3);
        list.traverse();
        list.printByHeadTail();
    }
}

