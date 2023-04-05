package com.company.Graph;

import java.util.ArrayList;

public class NoOfProvinces {

    public static int findCircleNum(int[][] isConnected){
        int vertices=isConnected.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<vertices;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<vertices;i++)
        {
            for(int j=0;j<vertices;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int count=0;
        boolean [] visited=new boolean[vertices];
        for(int i=0;i<vertices;i++)
        {
            if(!visited[i])
            {
                count++;
                dfs(adj,visited,i);
            }
        }

    return count;


    }

    private static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int node) {
        visited[node]=true;
        for (int x:adj.get(node))
        {
            if(!visited[x])
                dfs(adj,visited,x);

        }


    }

    public static void main(String[] args) {

    }
}
