package com.practice;

import java.util.HashMap;
import java.util.Map;

public class NumsCounter {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int limits = nums.length /2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            if(!map.containsKey(n)){
                map.put(n,1);
            }else{
                map.put(n, map.get(n)+1);
            }
        }
        System.out.println(printMatchCounter(map,limits));
    }

    static Integer printMatchCounter(Map<Integer,Integer> map,Integer limits){
        int result = -1;
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue() > limits){
                result = entry.getKey();
                return result;
            }
        }
        return result;
    }
}
