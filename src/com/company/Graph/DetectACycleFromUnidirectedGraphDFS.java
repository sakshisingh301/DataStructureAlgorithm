package com.company.Graph;

import java.util.ArrayList;

public class DetectACycleFromUnidirectedGraphDFS {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        Boolean [] visited=new Boolean[V];
        for(int i=0;i<V ; i++)
        {
            visited[i]=false;
        }
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                dfs(i,-1,adj,visited);
                return true;
            }
        }

        return false;
    }

    private boolean dfs(int node,int parent, ArrayList<ArrayList<Integer>> adj, Boolean[] visited) {
        visited[node]=true;
        for(int x: adj.get(node))
        {
            if(!visited[x])
            {
                visited[x]=true;
                if(dfs(x,node,adj,visited))
                {
                    return true;
                }
            }
            else if(x!=parent)
            {
                return true;
            }
        }
    return false;
    }

    public static void main(String[] args) {

    }


}
