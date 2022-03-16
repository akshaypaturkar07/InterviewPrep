package com.practice.crisil;

import java.util.Arrays;

public class DistibuteChocolates {
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
        //1,3,4,7,9,9,12,56
        int m = 5;
        int result = minDiff(arr, m);
        System.out.println("Min result -> " + result);
    }

    static int minDiff(int arr[], int m) {
        Arrays.sort(arr);
        int end = arr.length;
        int index =  m-1;
        int target = arr[index] - arr[0];
        int begin = 1;
        while (begin< end) {
            index = begin + m-1;
            if (index < end) {
                target = Math.min(target, arr[index] - arr[begin]);
            } else {
                return target;
            }
            begin++;
        }
        return target;
    }
}
