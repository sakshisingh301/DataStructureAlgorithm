package com.company.leetcode.dsaseries;

import java.util.LinkedList;
import java.util.Queue;

class Pair4
{
    int row;
    int column;
    int steps;
    public Pair4(int row, int column, int steps) {
        this.row = row;
        this.column = column;
        this.steps = steps;
    }
}
public class M01Matrix {

    public static int[][] updateMatrix(int[][] mat) {
        int [] dRow={-1,0,1,0};
        int [] dCol={0,1,0,-1};

        Queue<Pair4> queue=new LinkedList<>();
        int [] [] visited=new int[mat.length][mat[0].length];
        int [][] result=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==0)
                {
                    visited[i][j]=1;
                    queue.add(new Pair4(i,j,0));
                }
                else {
                    visited[i][j]=-1;
                }
            }
        }

        while(!queue.isEmpty())
        {
            int row=queue.peek().row;
            int column=queue.peek().column;
            int steps=queue.peek().steps;
            queue.remove();
            result[row][column]=steps;
            for(int i=0;i<4;i++)
            {
                int nrow=row+dRow[i];
                int ncol=column+dCol[i];
                if(nrow>=0 && nrow<mat.length && ncol>=0 && ncol<mat[0].length && visited[nrow][ncol]==-1 )
                {
                    visited[nrow][ncol]=1;
                    queue.add(new Pair4(nrow,ncol,steps+1));
                }
            }

        }
     return result;


    }



    public static void main(String[] args) {

    }
}
