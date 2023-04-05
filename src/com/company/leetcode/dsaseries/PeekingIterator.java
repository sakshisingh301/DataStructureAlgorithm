package com.company.leetcode.dsaseries;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PeekingIterator implements Iterator<Integer> {

    List<Integer> flattenedList=null;
    public PeekingIterator(Iterator<Integer> iterator) {

        flattenedList=new ArrayList<>();
       while(iterator.hasNext())
       {
           flattenedList.add(iterator.next());
       }

    }


    public Integer peek() {
        return flattenedList.get(0);

    }


    @Override
    public Integer next() {
        Integer val=flattenedList.get(0);
        flattenedList.remove(val);
        return val;

    }

    @Override
    public boolean hasNext() {
        return !flattenedList.isEmpty();


    }
}
