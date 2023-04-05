package com.company.challenge;

import java.util.Arrays;
import java.util.HashMap;

public class MaximumIceCreamBars {

    public static int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);
        int maxIcecream=0;
        int count=coins;

        for(int i=0;i<costs.length;i++)
        {

            count=count-costs[i];
            if(count<0)
            {
                break;
            }
            maxIcecream++;
            if(count==0)
            {
                break;
            }
        }
        return maxIcecream;



    }


    public static void main(String[] args) {
      int []  costs = {7,3,3,6,6,6,10,5,9,2};
      //6,7,7,8,8,10
      int  coins = 56;
      maxIceCream(costs,coins);

    }
}
