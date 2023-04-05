package com.company.Graph;

import java.util.ArrayList;
import java.util.List;

public class DfsOfGraph {
    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        boolean[] visited=new boolean[V+1];
        arrayList.add(0);
        visited[0]=true;
        dfs(0,V,adj,arrayList,visited);
        return arrayList;


    }
    public static void dfs(int node, int V, ArrayList<ArrayList<Integer>> adj, List<Integer> list,boolean [] visited)
    {
       visited[node]=true;
       list.add(node);
       for (int x:adj.get(node))
       {
           if(!visited[x])
               dfs(x,V,adj,list,visited);

       }

    }

    public void dfs(int V,ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited=new boolean[V];
        ArrayList<Integer> list=new ArrayList<>();
        visited[0]=true;
        dfsA(V,adj,visited,list,0);


    }

    private void dfsA(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> list,int node) {

        visited[node]=true;
        list.add(node);
        for(int x: adj.get(node))
        {
            if(!visited[x])
            {
                dfsA(v,adj,visited,list,x);
            }
        }
    }

    public static void main(String[] args) {

    }
}
