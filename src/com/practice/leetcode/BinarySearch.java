package com.practice.leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] ={-1,0,3,5,9,12};
        int target = 9;
        System.out.println(targetIndex(nums,target));
    }

    static int targetIndex(int nums[] ,int target){
        int start = 0,end = nums.length-1,mid;
        while(start <= end){
            mid = (end - start)/2 +start;
            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
