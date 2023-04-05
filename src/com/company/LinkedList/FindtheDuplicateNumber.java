package com.company.LinkedList;
//similar to linkedlist II
public class FindtheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[slow];

        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        slow=0;
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;

    }

    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
    }
}
