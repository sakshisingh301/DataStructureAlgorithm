package com.company.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FindDuplicate {

    public static ArrayList<Integer> solution(int [] a)
    {
        HashSet<Integer> hashSet1=new HashSet<>();
        HashSet<Integer> hashSet=new HashSet<>();
        for(int x: a)
        {
            if(!hashSet.contains(x))
            {
                hashSet.add(x);
            }
            else
            {
                hashSet1.add(x);
            }
        }
        if(hashSet1.size()==0)
            hashSet1.add(-1);
        ArrayList<Integer> list = new ArrayList<Integer>(hashSet1);
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {

        int a[] = {13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14 ,23, 14};
        System.out.println(solution(a));

    }
}
