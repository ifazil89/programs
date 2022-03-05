package com.fazil.ds.linkedlist.single;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.print();
		System.out.print("\nSize: " + list.getSize());
		list.remove(20);
		System.out.println("\nSize: " + list.getSize());
		list.print();
		list.remove(10);
		list.remove(40);
		System.out.print("\nSize: " + list.getSize());
		list.print();
		list.add(0,10);
		list.add(1,20);
		System.out.print("\nSize: " + list.getSize());
		list.print();
	}
}
