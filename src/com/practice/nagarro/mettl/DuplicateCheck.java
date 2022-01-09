package com.practice.nagarro.mettl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  Programme to check repeated numbers in array in ascending order
 *  input int arr[] = {1, 4, 2, 4, 3, 8, 7, 8,7}
 *  output int result[] = {4,7,8}
 */
public class DuplicateCheck {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4, 3, 8, 7, 8,7};
        Map<Integer,Integer> result = printDuplicates(arr, arr.length);
        List<Integer> resultList = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:result.entrySet()){
            if(entry.getValue() == 2){
                resultList.add(entry.getKey());
            }
        }
        for (Integer integer : resultList) {
            System.out.println(integer);
        }
    }

    static Map<Integer,Integer> printDuplicates(int[] arr, int length) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if(!numMap.containsKey(arr[i])){
                numMap.put(arr[i],1);
            }else{
                numMap.put(arr[i],numMap.get(arr[i])+1);
            }
        }
        return numMap;
    }
}
