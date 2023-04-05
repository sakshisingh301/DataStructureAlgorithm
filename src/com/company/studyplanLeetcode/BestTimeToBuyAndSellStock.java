package com.company.studyplanLeetcode;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

    int buy=0;
    int sell=1;
    int profit=0;
    int maxProfit=0;
    while(sell<prices.length)
    {
      if(prices[buy]>prices[sell])
      {
          buy=sell;
          sell++;


      }
      else
      {
          profit=prices[sell]-prices[buy];
          if(profit>maxProfit)
          {
              maxProfit=profit;
          }
          sell++;
      }
    }
    return maxProfit;
    }

    public static void main(String[] args) {
        int [] prices ={2,1,2,1,0,1,2};
        maxProfit(prices);
    }
}
