package com.company.Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair5
{
    int row;
    int column;
    int steps;

    public Pair5(int row, int column, int steps) {
        this.row = row;
        this.column = column;
        this.steps = steps;
    }
}

public class AsFarfromLandasPossible {

    public static int maxDistance(int[][] grid) {
        int [] dRow={-1,0,1,0};
        int [] dCol={0,1,0,-1};
        int maxDistance=0;
        int [] [] visited=new int[grid.length][grid[0].length];
        Queue<Pair5> queue=new LinkedList<>();
        for(int i=0;i< grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    queue.add(new Pair5(i,j,0));
                    visited[i][j]=1;
                }
                else
                {
                    visited[i][j]=0;
                }
            }
        }

        while(!queue.isEmpty())
        {
            int row=queue.peek().row;
            int column=queue.peek().column;
            int steps=queue.peek().steps;
            queue.remove();
            if(maxDistance<steps)
            {
                maxDistance=steps;
            }
            for(int i=0;i<4;i++)
            {
                int nrow=row+dRow[i];
                int ncol=column+dCol[i];
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]!=1 && visited[nrow][ncol]==0)
                {
                    visited[nrow][ncol]=1;
                    queue.add(new Pair5(nrow,ncol,steps+1));

                }
            }


        }
        return maxDistance;



    }

    public static void main(String[] args) {
       int [] [] grid = {{1,0,1},{0,0,0},{1,0,1}};
       maxDistance(grid);

    }
}
