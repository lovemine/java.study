package org.windfree.util.array;

public class FindSquareArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        findSquarArray(arr);

    }

    private static void findSquarArray(int[][] array) {
        int arrayLength = array.length;
        for(int i = 0; i < arrayLength; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("\r\n---").append(i).append("*").append(i).append(" array -----\r\n");
            System.out.println(sb.toString());
            printArray(array,i+1,arrayLength);
        }
    }

    private static void printArray(int[][] array, int dim, int arrayLen) {

    }
}
