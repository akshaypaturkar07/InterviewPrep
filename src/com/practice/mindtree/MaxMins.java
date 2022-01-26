package com.practice.mindtree;

import java.util.Arrays;

public class MaxMins {
    public static void main(String[] args) {
        int[] nums = {5,3,1,7,9};  // 1 3 5 7 9
        Arrays.sort(nums);
        long x=0;
        long y=0;
        for(int i=0;i<4;i++){
            x+=nums[i];
        }
        for(int i=1;i<5;i++){
            y+=nums[i];
        }
        System.out.println(x+" "+y);
    }
}
