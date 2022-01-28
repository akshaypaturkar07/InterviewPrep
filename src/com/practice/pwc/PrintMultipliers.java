package com.practice.pwc;

import java.util.Arrays;

public class PrintMultipliers {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int[] result =  new int[arr.length];
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            int product = 1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    product*=arr[j];
                }
            }
            result[counter++]=product;
        }
        Arrays.stream(result).forEach(e->System.out.println(e));
    }
}
