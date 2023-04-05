package com.company.leetcode.dsaseries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger {

    public static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> list=new ArrayList<>();
        int length=num.length;
        int N=length-1;
        int curr=k;
        while(N>=0 || curr>0)
        {
            curr=curr+num[N];
            list.add(curr%10);
            curr=curr/10;
            N--;

        }
        Collections.reverse(list);
   return list;

    }

    public static void main(String[] args) {
      int []  num = {9,9,9,9,9,9,9,9,9,9};
      int k = 1;
      addToArrayForm(num,k);
    }
}
