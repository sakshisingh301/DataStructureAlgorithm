package com.company.Graph;

import java.util.LinkedList;
import java.util.Queue;


public class ShortestPathInMatrix {

    public static int shortestPathBinaryMatrix(int[][] grid) {
        int shortestPath=0;

     if(grid[0][0]!=0 || grid[grid.length-1][grid[0].length-1]!=0)
         return -1;
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
     Queue<int []> queue=new LinkedList<>();
     boolean [] [] visited= new boolean[grid.length][grid[0].length];
     queue.add(new int[]{0,0});
     visited[0][0]=true;

     while (!queue.isEmpty())

     {

         int size= queue.size();
         shortestPath++;
         for (int i=0;i<size;i++) {
             int[] curr = queue.poll();
             if (curr[0] == grid.length - 1 && curr[1] == grid[0].length) {
                 return shortestPath;
             }
             for(int [] dir : dirs)
             {
                 int nrow=curr[0]+dir[0];
                 int ncol=curr[1]+dir[1];

                 if(nrow>=0 && ncol>=0 && nrow<= grid.length && ncol<=grid[0].length && !visited[nrow][ncol] && grid[nrow][ncol]!=1)
                 {
                     visited[nrow][ncol]=true;
                     queue.add(new int []{nrow,ncol});
                 }
             }
         }



     }





        return shortestPath;

    }


    public static void main(String[] args) {
        int [] [] grid={{0,0,0},{1,1,0},{1,1,0}};
    }
}
