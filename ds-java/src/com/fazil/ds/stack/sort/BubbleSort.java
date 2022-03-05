package com.fazil.ds.stack.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  array: ");
		String[] inputStringArr = reader.readLine().split(" ");
		List<Integer> inputList = Arrays.stream(inputStringArr)
										.map(input -> Integer.parseInt(input))
										.collect(Collectors.toList());
		Integer[] inputs = inputList.toArray(new Integer[1]);
		for(int i = 0; i < inputs.length ; i++) {
			//System.out.println(inputs[i]);
			for (int j = 0; j < inputs.length - 1 - i; j++) {
				if (inputs[j] > inputs[j+1]) {
					int tmp = inputs[j];
					inputs[j] = inputs[j+1];
					inputs[j+1] = tmp;
				}
			}
		}
		
		for(int i = 0; i <= inputs.length-1 ; i++) {
			System.out.println(inputs[i]);
		}
 
	}
}
