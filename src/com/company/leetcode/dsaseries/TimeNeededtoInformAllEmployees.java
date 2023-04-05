package com.company.leetcode.dsaseries;


import java.util.*;


public class TimeNeededtoInformAllEmployees {

    public  static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (manager[i] != -1)
                graph[manager[i]].add(i);
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{headID, 0});
        int ans = 0;
        while (!q.isEmpty()) {
            int[] top = q.poll();
            int u = top[0];
            int w = top[1];
            ans = Math.max(w, ans);
            for (int v : graph[u])
                q.offer(new int[]{v, w + informTime[u]});
        }
        return ans;



    }



    public static void main(String[] args) {
        int n = 6;
        int headID = 2;
        int [] manager = {2,2,-1,2,2,2};
        int [] informTime = {0,0,1,0,0,0};
        numOfMinutes(n,headID,manager,informTime);
    }
}
