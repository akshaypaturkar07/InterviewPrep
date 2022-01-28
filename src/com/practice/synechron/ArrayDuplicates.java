package com.practice.synechron;

import java.util.Arrays;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,15,10,25,50,15,10,1,9};
        Arrays.sort(arr);
        int result[] = new int[arr.length];
        int counter = 0;
        int temp = arr[0];
        result[counter++] = temp;
        for(int i=1;i<arr.length;i++){
            if(temp ==  arr[i]){
                continue;
            }else{
                result[counter++] = arr[i];
                temp = arr[i];
            }

        }
        Arrays.stream(result).forEach(System.out::println);
    }
}
