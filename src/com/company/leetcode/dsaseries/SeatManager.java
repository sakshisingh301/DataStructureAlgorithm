package com.company.leetcode.dsaseries;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.PriorityQueue;

class SeatManager {

    PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>(Comparator.reverseOrder());

    public SeatManager(int n) {

        for(int i=0;i<n;i++)
        {
            max_heap.add(i+1);
        }

    }

    public int reserve() {
        return !max_heap.isEmpty() ? max_heap.poll() : 0;



    }

    public void unreserve(int seatNumber) {
        max_heap.add(seatNumber);
    }
}