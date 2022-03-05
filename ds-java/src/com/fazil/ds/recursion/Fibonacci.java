package com.fazil.ds.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 0+1+1+2+3+5+8....
 * fibonacci(1),fibonacci(2),fibonacci(3),....
 * @author fazilibrahimlocal
 *
 */
public class Fibonacci {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter N : ");
		int N = Integer.parseInt(reader.readLine());
		
		Fibonacci fibo = new Fibonacci();
		int resultWithoutRecursion = fibo.findFiboWithoutRecursion(N);
		System.out.println(resultWithoutRecursion);
		 
		int resultWithRecursion = fibo.findFiboWithRecursion(N);
		System.out.println("Result with recursion: "+resultWithRecursion);
		
	}

	private int findFiboWithRecursion(int n) {
		//we have take first element as 1 => fib(1) = 0, fib(2) = 1
		if (n == 1) {
			System.out.println("Returning 0");
			return 0;
		}
		if (n == 2) {
			System.out.println("Returning 1");
			return 1;
		}
		return findFiboWithRecursion(n-2) + findFiboWithRecursion(n-1);
	}

	private int findFiboWithoutRecursion(int n) {
		int fib1 = 0;
		int fib2 = 1;
		int fibN = 0;
		for (int i= 3; i <= n; i++) {
			fibN = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibN;
		}
		return fibN;
	}
	
}
