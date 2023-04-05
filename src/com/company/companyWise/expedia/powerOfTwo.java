package com.company.companyWise.expedia;

import java.util.ArrayList;
import java.util.List;

//asked in expedia
public class powerOfTwo {
    public static List<Integer> powerOfTwo(List<Integer> list)
    {
        boolean [] powerOfTwo=new boolean[list.size()];
        List<Integer> temp=new ArrayList<>();
        for (boolean x:powerOfTwo)
        {
            x=false;
        }
    for(int i=0;i<list.size();i++)
    {
       int num=list.get(i);
       if(num==1)
       {
           powerOfTwo[i]=true;
       }
       else
       {
           if((num & (num-1))==0)
           {
               powerOfTwo[i]=true;
           }
           else {
               powerOfTwo[i]=false;
           }
       }


    }
        for(int i=0;i<powerOfTwo.length;i++)
        {
            if(powerOfTwo[i])
            {
                temp.add(1);
            }
            else {
                temp.add(0);
            }
        }

        return temp;


    }
//    public boolean isPowerOfTwo(int n) {
//     if(n==0 )
//         return true;
//     if((n&(n-1))==0)
//         return true;
//     return false;
//
//
//
//    }



    public static void main(String[] args) {
        int [] nums={1,2,3,6,7,16};
        List<Integer> list=new ArrayList<>();
        for(int x:nums)
        {
            list.add(x);
        }
        powerOfTwo(list);



    }
}
