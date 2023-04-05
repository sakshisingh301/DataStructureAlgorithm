package com.company.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsOfGraph {

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean[] visited=new boolean[V];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        visited[0]=true;
        while(!queue.isEmpty())
        {
            int node= queue.poll();
            bfs.add(node);
            for(int x: adj.get(node))
            {
                if(!visited[x])
                {
                    visited[x]=true;
                    queue.add(node);
                }
            }
        }
    return bfs;

    }

    public ArrayList<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] visited=new boolean[V];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        visited[0]=true;
        while(!queue.isEmpty())
        {
            int node= queue.poll();
            list.add(node);
            for(int x: adj.get(node))
            {
                queue.add(x);
                visited[x]=true;
            }

        }
        return list;
    }

    public static void main(String[] args) {

    }
}
