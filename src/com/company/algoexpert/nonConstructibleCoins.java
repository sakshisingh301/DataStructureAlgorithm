package com.company.algoexpert;

import java.util.Arrays;

public class nonConstructibleCoins {

    public static int nonConstructibleChange(int[] coins) {
        int change=0;
        Arrays.sort(coins);
        Boolean flag=true;
        if(coins.length==1)
            return 1;
        for(int i=0;i<coins.length-1;i++)
        {
            if(coins[i]!=coins[i+1])
            {
                flag=false;
            }
        }
        if(flag==true)
            return coins.length+1;
        for(int i=0;i<coins.length;i++)
        {
            change=change+coins[i];
//

            if(  i<coins.length-1 && change+1<coins[i+1] )
            {
                break;
            }
        }
        return change+1;
    }

    public static void main(String[] args) {
      int [] a={5, 6, 1, 1, 2, 3, 4, 9
      };
     System.out.println( nonConstructibleChange(a));
    }
}
