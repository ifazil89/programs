package com.fazil.ds.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1*2*3*....*n
 * @author fazilibrahimlocal
 *
 */
public class Factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter N : ");
		int N = Integer.parseInt(reader.readLine());
		Factorial factorial = new Factorial();
		int result = factorial.findFactorialWithoutRecursion(N);
		System.out.println("Result is : "+result);
		int recursionResult = factorial.findFactorialWithRecursion(N);
		System.out.println("Recursion result is : "+recursionResult);
	}

	private int findFactorialWithRecursion(int N) {
		if (N == 1) {
			System.out.println("Returning 1");
			return 1;
		} else {
			System.out.println(String.format("Returning %d * findFactorialWithRecursion(%d-1)", N, N));
			return N * findFactorialWithRecursion(N-1);
		}
	}

	private int findFactorialWithoutRecursion(int N) {
		
		int result = 1;
		for (int i = 1; i <= N; i++) {
			result *= i;
		}
		return result;
	}
}
