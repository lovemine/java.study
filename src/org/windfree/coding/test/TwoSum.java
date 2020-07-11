package org.windfree.coding.test;

import java.util.*;

public class TwoSum {
    public  static void main(String[] args) {
        TwoSum a = new TwoSum();
        int[] nums = {2,8, 10,21,};
        int target = 31;
        int[] answer = a.solve(nums, target);
        for(int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);

        }
    }

    public int[] solve(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(maps.containsKey(nums[i])) {
                result[0] = maps.get(nums[i]) + 1;
                result[1] = i + 1;
            } else {
                maps.put(target - nums[i], i);
            }
        }
        return result;

    }
}
