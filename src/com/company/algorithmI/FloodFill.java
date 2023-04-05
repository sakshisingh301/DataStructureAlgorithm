package com.company.algorithmI;

import java.util.LinkedList;
import java.util.Queue;

class Pair
{
    int row;
    int column;

    Pair(int row,int column)
    {
        this.row=row;
        this.column=column;
    }
}
public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor=image[sr][sc];
        int [] delRow={-1,0,1,0};
        int [] delCol={0,1,0,-1};
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(sr,sc));
        while(!queue.isEmpty())
        {
            int row=queue.peek().row;
            int column=queue.peek().column;
            image[row][column]=color;
            queue.poll();
            for(int i=0;i<4;i++)
            {
                int nRow=row+delRow[i];
                int nCol=column+delCol[i];
                if(nRow>0 && nRow<image.length && nCol>0 && nCol<image[0].length && image[nRow][nCol]==initialColor)
                {
                    queue.add(new Pair(nRow,nCol));
                }

            }

        }
        return image;

    }

    public static void main(String[] args) {

    }
}
