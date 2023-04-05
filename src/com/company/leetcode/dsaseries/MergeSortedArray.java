package com.company.leetcode.dsaseries;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1=0;
        int pointer2=0;
        int temp=0;
        int [] num1Copy=new int[m];
        for(int i=0;i<m;i++)
        {
            num1Copy[i]=nums1[i];
        }
        while(pointer1<m && pointer2<n)
        {
            if(num1Copy[pointer1]<=nums2[pointer2])
            {
                nums1[temp]=num1Copy[pointer1];
                pointer1++;
                temp++;
            }
            else if(num1Copy[pointer1]>nums2[pointer2])
            {
                nums1[temp]=nums2[pointer2];
                pointer2++;
                temp++;

            }
        }
        while (pointer2<n)
        {
            nums1[temp]=nums2[pointer2];
            pointer2++;
            temp++;
        }
        while(pointer1<m)
        {
            nums1[temp]=num1Copy[pointer1];
            pointer1++;
            temp++;
        }




    }

    public static void main(String[] args) {
        int [] nums1 = {2,0};
        int m = 1;
        int [] nums2 = {1};
        int n = 1;
        merge(nums1,m,nums2,n);

    }
}
