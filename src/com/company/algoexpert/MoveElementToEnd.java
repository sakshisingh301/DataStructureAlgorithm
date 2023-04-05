package com.company.algoexpert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int start=0;
        int end=array.size()-1;
        while(start<end)
        {
            if(array.get(end)==toMove)
            {
                end--;
            }
            else if(array.get(start)==toMove && array.get(end)!=toMove)
            {
                int src=start;
                int dsc=end;
                Collections.swap(array,dsc,src);
                start++;
                end--;

            }
            else if(array.get(start)!=toMove && array.get(end)!=toMove)
            {
                start++;
            }
        }
     return array;

    }
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(2);
        int toMove=2;
        moveElementToEnd(a,toMove);
    }
}
