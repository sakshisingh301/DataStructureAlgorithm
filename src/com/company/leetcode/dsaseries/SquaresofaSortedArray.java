package com.company.leetcode.dsaseries;

public class SquaresofaSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int k=nums.length-1;
        int [] temp=new int[nums.length];
        while(start<=end) {
            if ((nums[start] * nums[start]) <= (nums[end] * nums[end])) {
                temp[k] = (nums[end] * nums[end]);
                end--;
                k--;

            } else if ((nums[start] * nums[start]) > (nums[end] * nums[end])) {
                temp[k] = (nums[start] * nums[start]);
                start++;
                k--;

            }

        }
        return temp;

    }

    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        sortedSquares(nums);
    }
}
