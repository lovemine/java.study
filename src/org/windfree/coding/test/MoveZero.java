package org.windfree.coding.test;

import java.util.ArrayList;
import java.util.List;

public class MoveZero {

    public static void main(String[] args) {
        int[] nums = { 0, 3, 2, 0, 8, 5 };
        MoveZero a = new MoveZero();
        a.solve(nums);

    }

    public void solve(int[] input) {
        List<Integer> list = new ArrayList<Integer>();
        int len = input.length;
        for(int i = 0; i < len;i++) {
            if(input[i] != 0) {
                list.add(input[i]);
            }int[] nums = { 0, 3, 2, 0, 8, 5 };
        }
        int[] out = new int[input.length];
        for(int i = 0; i < list.size(); i++) {
            out[i] = list.get(i);
        }
        for(int i = list.size() ; i < out.length; i ++) {
            out[i] = 0;
        }

        for(int i = 0; i < out.length; i++) {
            System.out.print(out[i]+ " ");
        }

    }
}
