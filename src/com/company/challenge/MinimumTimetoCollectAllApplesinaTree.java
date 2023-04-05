package com.company.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumTimetoCollectAllApplesinaTree {


    public static int minTime(int n, int[][] edges, List<Boolean> hasApple) {

      List<List<Integer>> adj=new ArrayList<>();
      for(int i=0;i<n;i++)
      {
          adj.add(new ArrayList<>());
      }

      for(int [] edge:edges)
      {
          adj.get(edge[0]).add(edge[1]);
          adj.get(edge[1]).add(edge[0]);
      }
      return minAppleTimePick(0,edges,adj,hasApple,0);

    }

    private static int minAppleTimePick(int index, int[][] edges, List<List<Integer>> adj, List<Boolean> hasApple, int parent) {

        int time=0;

        for(int x: adj.get(index))
        {
            if(x==parent)
                continue;
            time=time+minAppleTimePick(index,edges,adj,hasApple,parent);
        }
        if(hasApple.get(index) && index>0 ||time>0 )
        {
            time=time+2;
        }
        return time;

    }

    public static void main(String[] args) {
       int  n = 7;
       int [] [] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
       List<Boolean> hasApple = new ArrayList<>();
       hasApple.add(false);
        hasApple.add(false);
        hasApple.add(true);
        hasApple.add(false);
        hasApple.add(true);
        hasApple.add(true);
        hasApple.add(false);
      minTime(n,edges,hasApple);
    }
}
