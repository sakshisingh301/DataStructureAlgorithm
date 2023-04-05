package com.company.leetcode.dsaseries;

import java.util.ArrayList;
import java.util.List;

class MyCalendar {

 List<int []> list;



    public MyCalendar() {
        list=new ArrayList<>();

    }

    public boolean book(int start, int end) {

        for (int[] x: list)
        {
            if(x[1]>start && x[0] <end ) //[47,50] [33,41], for 33,41 it should return true
            {
                return false;
            }
        }
        list.add(new int []{start,end});


        return true;
    }
}
//[10,20] [15,25]
