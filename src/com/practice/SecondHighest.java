package com.practice;

public class SecondHighest {
    public static void main(String[] args) {
        int arr[] = {8,2,9,5,6,10};
        int highest = 0;
        int secondHighest = arr[0];

        for(int i=1;i< arr.length;i++){
            if(arr[i] > secondHighest){
                highest = arr[i];
            }else{
                secondHighest =  Math.max(secondHighest, arr[i]);
            }
        }
        System.out.println(secondHighest);

    }
}
