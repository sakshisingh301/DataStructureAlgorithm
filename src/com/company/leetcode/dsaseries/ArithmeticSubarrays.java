package com.company.leetcode.dsaseries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArithmeticSubarrays {
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {


        List<Boolean> result=new ArrayList<>();
        int p1=0;
        int p2=0;
        while(p1<l.length && p2<r.length)
        {
            List<Integer> temp=new ArrayList<>();
            int index1=l[p1];
            int index2=r[p2];
            for(int i=index1;i<=index2;i++)
            {

            temp.add(nums[i]);


            }
            boolean status= check(temp,index1,index2);
            result.add(status);
            p1++;
            p2++;
        }
        return result;

    }
    public static boolean check(List<Integer> list, int start, int end)
    {
        Collections.sort(list);
        int diff=list.get(1)-list.get(0);
        for(int i=0;i< list.size()-1;i++)
        {
            if(list.get(i+1)-list.get(i)!=diff)
            {
                return false;
            }
        }
        return true;



    }



    public static void main(String[] args) {
       int [] nums = {4,6,5,9,3,7};
       int [] l = {0,0,2};
       int [] r = {2,3,5};
       checkArithmeticSubarrays(nums,l,r);
    }
}
