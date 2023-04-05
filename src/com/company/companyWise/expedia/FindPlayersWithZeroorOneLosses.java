package com.company.companyWise.expedia;

import java.util.*;

public class FindPlayersWithZeroorOneLosses {

    public static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result=new ArrayList<>();
        TreeSet<Integer> temp=new TreeSet<>();
        List<Integer> temp2=new ArrayList<>();
       int []  losers=new int [matches.length];
        int [] winners=new int[matches.length];
        for(int i=0;i< matches.length;i++)
        {
            losers[i]=matches[i][1];
            winners[i]=matches[i][0];
        }

       HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<losers.length;i++)
        {
            hashSet.add(losers[i]);
        }

        for(int i=0;i< winners.length;i++)
        {
            if(!hashSet.contains(winners[i]))
            {
                temp.add(winners[i]);
            }
        }

     result.add(new ArrayList<>(temp));
     HashMap<Integer,Integer> losersMap=new HashMap<>();
     for(int i=0;i<losers.length;i++)
     {
         if(!losersMap.containsKey(losers[i]))
         {
           losersMap.put(losers[i],1);

         }
         else
         {
             losersMap.put(losers[i],losersMap.get(losers[i])+1);
         }
     }

        for (Map.Entry<Integer, Integer> entry : losersMap.entrySet()) {
            if(entry.getValue()==1)
            {
                temp2.add(entry.getKey());
            }

        }
       Collections.sort(temp2);
        result.add(temp2);



        return result;




    }


    public static void main(String[] args) {
        int [] [] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        findWinners(matches);


    }
}
