package com.practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            List<Integer> list = null;
            for (int j = i + 1; j < nums.length - 2; j++) {
                list = new ArrayList<>();
                int result = nums[i] + nums[j] + nums[j + 1];
                if (result == 0) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[j + 1]);
                }
                output.add(list);
            }

        }
        return output;
    }
}
