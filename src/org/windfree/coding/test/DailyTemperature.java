package org.windfree.coding.test;

import java.util.ArrayList;
import java.util.List;

public class DailyTemperature {
    public  static void main(String[] args) {
        DailyTemperature d = new DailyTemperature();
        int nums[] = {73,74,75,71,69,72,76,73};
        List<Integer> answer = d.solve(nums);
        for(int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }

    public List<Integer> solve(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            boolean find = false;
            for(int j = i +1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    find = true;
                    list.add(j-i);
                    break;
                }
            }
            if(!find) {
                list.add(0);
            }

        }
        return list;
    }
}
