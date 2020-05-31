package org.windfree.lang.java;
//주어진 배열을 90 도 회전한다.
public class rotateArray {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		print(arr);
		System.out.println();
		arr = clock90(arr);
		print(arr);
		
		System.out.println();
		arr = clock90(arr);
		print(arr);
		
		System.out.println();
		arr = clock90(arr);
		print(arr);
		
		System.out.println();
		arr = clock90(arr);
		print(arr);
	}
	
	private static  int[][]   clock90 (int[][] orgArr) { 
		//orgArray(row,col) --> rotatedArray(col, (rowCount -1 )- row) 
		int rowCount = orgArr.length;
		int colCount = orgArr[0].length;
		
		int[][] targetArr = new int[colCount][rowCount];
		for(int i = 0; i < rowCount; i++) {
			for(int j = 0 ; j < colCount; j++) {
				targetArr[j][rowCount-1-i] =  orgArr[i][j];
			}
		}
		
		return targetArr;
		
		
	}
	
	private static void print(int[][] arr) {
		int rowCount = arr.length;
		int colCount = arr[0].length;
		for(int i = 0; i < rowCount; i++) {
			System.out.println();
			for(int j = 0; j < colCount; j++) {
				System.out.print(arr[i][j] + "   ");
			}
		}
	}
}

