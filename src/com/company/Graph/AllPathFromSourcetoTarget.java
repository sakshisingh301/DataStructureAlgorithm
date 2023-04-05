package com.company.Graph;

import java.util.*;

public class AllPathFromSourcetoTarget {


    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> result=new ArrayList<>();
        List<Integer> currlist=new ArrayList<>();
        Queue<List<Integer>> queue=new LinkedList<>();
        currlist.add(0);
        queue.add(currlist);

        while(!queue.isEmpty())
        {
             currlist=queue.poll();
            int v=currlist.get(currlist.size()-1);
            if(v== graph.length-1)
            {
                result.add(currlist);
                continue;
            }
            for(int x: graph[v])
            {
                List<Integer> temp=new ArrayList<>();
                temp.add(x);
                queue.add(temp);
            }


        }

return result;

    }

    public static void main(String[] args) {
        int [] [] graph={{1,2},{3},{3},{}};
        allPathsSourceTarget(graph);
    }
}
