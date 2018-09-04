package org.windfree.lang.java;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		int[] arr = {1,3,2,4,5,7,9,8,6};
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " " );
		}
		System.out.println();
		
		int startIndx = 2; 
		int temp = arr[startIndx];
		arr[startIndx] = arr[startIndx + 2];
		arr[startIndx + 2] = temp;
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " " );
		}
		System.out.println();
		
		Arrays.sort(arr);
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " " );
		}
		System.out.println();
	}
}
