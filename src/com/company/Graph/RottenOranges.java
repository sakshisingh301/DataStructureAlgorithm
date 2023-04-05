package com.company.Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair
{
    int row;
    int column;
    int time;

    public Pair(int row, int column, int time) {
        this.row = row;
        this.column = column;
        this.time = time;
    }
}

public class RottenOranges {

    public static int orangesRotting(int[][] grid) {
        int count=0;
        int freshOrgan=0;
        Queue<Pair> queue=new LinkedList<>();
        int [] [] visited=new int[grid.length][grid[0].length];

        for (int i=0;i< grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
              if(grid[i][j]==1)
              {
                  freshOrgan++;
              }
            }
        }
        for(int i=0;i< grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    visited[i][j]=2;
                    queue.add(new Pair(i,j,0));
                }
                else {
                    visited[i][j]=0;
                }
            }
        }
        int [] dRow={-1,0,1,0};
        int [] dCol={0,1,0,-1};
        int tm=0;

        while (!queue.isEmpty())
        {
            int row=queue.peek().row;
            int column=queue.peek().column;
            int t=queue.peek().time;
            tm=Math.max(t,tm);

            queue.remove();
            for(int i=0;i<4;i++)
            {
                int nRow=row+dRow[i];
                int nCol=column+dCol[i];
                if(nRow>=0 && nRow<grid.length && nCol<grid[0].length && nCol>=0 && visited[nRow][nCol]==0 && grid[nRow][nCol]==1)
                {
                    visited[nRow][nCol]=2;
                    queue.add(new Pair(nRow,nCol,t+1));
                    count++;
                }
            }


        }
        if(count!=freshOrgan)
        {
            return -1;
        }


   return tm;
    }




    public static void main(String[] args) {

    }
}
