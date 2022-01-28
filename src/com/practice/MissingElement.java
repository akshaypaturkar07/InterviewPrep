package com.practice;

public class MissingElement {
    public static void main(String[] args) {
        int[] nums1 = {10,1,2,6,9,13};
        int[] nums2 = {10,100,1000};
        int[] nums3 = {1,2,3,4,5,10,9,8,32,6};
        System.out.println(printMissingNum(nums1));
        System.out.println(printMissingNum(nums2));
        System.out.println(printMissingNum(nums3));
    }

    static int printMissingNum(int[] nums){
        int counter = 1;
        for(int i=0; i< nums.length;i++){
            if(counter == nums[i]){
                counter++;
            }else{
                break;
            }
        }
        return counter;
    }
}
