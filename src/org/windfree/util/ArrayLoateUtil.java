package org.windfree.util;

public class ArrayLoateUtil {
	public  static void printArray(int[][] arr) {
		int rowCount = arr.length;
		int colCount = arr[0].length;
		for(int i = 0; i < rowCount; i++) {
			System.out.println();
			for(int j = 0; j < colCount; j++) {
				System.out.print(arr[i][j] + "   ");
			}
		}
	}
	
	public static void rotate90Clockwise(int[][] arr) {
		
	}
}
