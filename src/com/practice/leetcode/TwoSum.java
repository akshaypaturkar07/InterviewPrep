package com.practice.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] input = {3, 2, 4};
        int targetSum = 6;
        int[] result = new int[2];
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                int output = input[i] + input[j];
                if (output == targetSum) {
                    result[0] = i;
                    result[1] = j;
                }
            }

        }
        Arrays.stream(result).forEach(System.out::println);
        Arrays.stream(calculate2Sum(input, targetSum)).forEach(System.out::println);
    }

    static int[] calculate2Sum(int[] input, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < input.length; i++) {
            int diff = target - input[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }else{
                map.put(input[i],i);
            }
        }
        return result;
    }
}
