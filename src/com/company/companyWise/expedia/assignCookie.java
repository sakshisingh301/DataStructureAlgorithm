package com.company.companyWise.expedia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class assignCookie {

    public static int findContentChildren(int[] g, int[] s) {
        int count=0;

        HashMap<Integer,Integer> mapG=new HashMap<>();
        for(int i=0;i<g.length;i++)
        {
            mapG.put(g[i],i);
        }

        for(int i=0;i<s.length;i++)
        {
            if(mapG.containsKey(s[i]))
            {
                count++;
                mapG.remove(s[i]);
            }

        }
        return count;
    }

    public static void main(String[] args) {

       int [] g = {1,2,3};
       int [] s = {1,1};
       findContentChildren(g,s);


    }
}
