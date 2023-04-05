package com.company.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair3
{
    int node;
    int parent;


    public Pair3(int node, int parent) {
        this.node = node;
        this.parent = parent;
    }
}

public class DetectACycleFromUnidirectedGraphBFS {

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        Boolean visited []=new Boolean[V];
        for(int i=0;i<V ; i++)
        {
            visited[i]=false;
        }
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                detectCycle(V,adj,i,visited);
                return true;
            }
        }
        return false;

    }

    private boolean detectCycle(int v, ArrayList<ArrayList<Integer>> adj, int src, Boolean[] visited) {

        visited[src]=true;
        Queue<Pair3> queue=new LinkedList<>();
        queue.add(new Pair3(src,-1));
        while (!queue.isEmpty())
        {
            int node =queue.peek().node;
            int parent=queue.peek().parent;
            queue.poll();

            for(int x: adj.get(node))
            {
                if(!visited[x])
                {
                    visited[x]=true;
                    queue.add(new Pair3(x,node));
                }
                else  if(parent!=x)
                {
                    return false;
                }
            }
        }
        return true;


    }


    public static void main(String[] args) {

    }
}
