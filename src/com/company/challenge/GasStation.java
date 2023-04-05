package com.company.challenge;

public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        if(printSum(gas)<printSum(cost)) return -1;
        int answer=-1;
        int diff=0;
        for(int i=0;i<gas.length;i++)
        {
          diff=diff+(gas[i]-cost[i]);
          if(diff<0)
          {
              diff=0;
              answer=i+1;
          }
        }
        return answer;


    }
    public static int printSum(int [] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {
       int [] gas = {3,1,1};
       int [] cost = {1,2,2};

    }
}
