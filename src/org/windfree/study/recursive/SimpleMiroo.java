package org.windfree.study.recursive;

public class SimpleMiroo {
    public static void main(String[] args) {
        int[] arr = new int[] {6,5,3,1,2,4};
        find(arr,0  );
    }

    public  static void find(int[] arr, int i ) {
        if(i == arr.length -1 ) {
            System.out.print(arr[i]);
            return;
        }
        System.out.print(arr[i] + "->");
        find(arr,i+1);
    }
}
