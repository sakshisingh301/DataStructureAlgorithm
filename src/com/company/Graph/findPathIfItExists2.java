package com.company.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class findPathIfItExists2 {
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean [] visited=new boolean[n];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(source);
        visited[source]=true;

        while(!queue.isEmpty())
        {
            int top= queue.poll();
            if(top==destination)
            {
                return true;
            }
            for(int x : adj.get(top))
            {
               if(!visited[x])
               {
                   visited[x]=true;
                   queue.add(x);
               }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
        int source = 0;
        int destination = 2;
        validPath(n, edges, source, destination);


    }
}
