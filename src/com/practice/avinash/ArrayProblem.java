package com.practice.avinash;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayProblem {
    public static void main(String[] args) {  // 1 8    3 2 5 2  3 20 10 5
        Integer[] arr1 = {8};
        Integer[] arr2 = {2, 5, 2};
        Integer[] arr3 = {20, 10, 5};
        System.out.println(findAns(arr1,0,0));
        System.out.println("---------------------");
        System.out.println(findAns(arr2,0,0));
        System.out.println("---------------------");
        System.out.println(findAns(arr3,0,0));
        System.out.println("---------------------");
    }

    static int findAns(Integer[] num,int counter,int start) {
        Set<Integer> numSet = Stream.of(num).collect(Collectors.toSet());
        num = numSet.stream().toArray(Integer[]::new);
        int end = num.length;
        while (start < end) {
            int divBy2 = num[start] % 2;
            int remainder = num[start] / 2;
            if (divBy2 == 0) {
                counter++;
                num[start] =remainder;
            } else {
                start++;
            }
            return findAns(num,counter,start);
        }
        return counter;
    }
}
