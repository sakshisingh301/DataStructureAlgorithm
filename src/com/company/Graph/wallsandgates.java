package com.company.Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair9
{
    int row;
    int column;
    int steps;

    public Pair9(int row, int column, int steps) {
        this.row = row;
        this.column = column;
        this.steps = steps;
    }
}
public class wallsandgates {

    public void wallsAndGates(int[][] rooms) {

       boolean [] [] visited=new boolean[rooms.length][rooms[0].length];
       int [] [] result=new int[rooms.length][rooms[0].length];

        Queue<Pair9> queue=new LinkedList<>();

        for(int i=0;i<rooms.length;i++)
        {
            for(int j=0;j<rooms[0].length;j++)
            {
                if(rooms[i][j]==-1)
                {
                    queue.add(new Pair9(i,j,0));
                    visited[i][j]=true;
                    result[i][j]=-1;
                }
                else
                {
                    visited[i][j]=false;
                }
            }
        }

        int [] dRow={-1,0,1,0};
        int [] dCol={0,1,0,-1};
        while(!queue.isEmpty())
        {
            int row=queue.peek().row;
            int column=queue.peek().column;
            int step=queue.peek().steps;
            queue.remove();
            for(int i=0;i<4;i++)
            {
                int nRow=row+dRow[i];
                int nCol=column+dCol[i];
                if(nRow>=0 && nRow<rooms.length && nCol>=0 && nCol<rooms[0].length && rooms[nRow][nCol]!=-1 && !visited[nRow][nCol])
                {
                    visited[nRow][nCol]=true;
                    queue.add(new Pair9(nRow,nCol,step++));
                    rooms[nRow][nCol]=step;
                }
            }

        }


    }

    public static void main(String[] args) {
        int [] [] rooms = {{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};

    }
}
