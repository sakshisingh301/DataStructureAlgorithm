package com.company.studyplanLeetcode;

public class CountOddNumbersinanIntervalRange {

    public static int countOdds(int low, int high) {
         int count=0;
        while (low<=high)
        {
            if(low%2!=0)
                count++;
            low++;


        }
        return count;

    }

    public static void main(String[] args) {
        int  low = 3;
        int high = 7;
        countOdds(low,high);
    }
}
