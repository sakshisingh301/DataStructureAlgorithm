package com.company.challenge;

import java.util.HashMap;
import java.util.Map;

public class ConfusingNumber {

    public boolean confusingNumber(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(6,9);
        map.put(8,8);
        map.put(9,6);
       int nCopy=n;
       int rotatedNumber=0;
       while(nCopy>0)
       {
           int temp=nCopy%10;
           if(!map.containsKey(temp))
               return false;
           rotatedNumber=rotatedNumber*10+map.get(temp);
           nCopy=nCopy/10;

       }
       return rotatedNumber!=n;


    }

    public static void main(String[] args) {
        int n = 89;
    }
}
