package com.company.Graph;

import java.util.LinkedList;
import java.util.Queue;
class Pair1
{
    int row;
    int column;


    public Pair1(int row, int column) {
        this.row = row;
        this.column = column;

    }
}
public class FloodFill {




    public static int[][] floodFill1(int[][] image, int sr, int sc, int color) {

        int intialColor=image[sr][sc];
        int [] [] temp=image;
        int [] delRow={-1,0,1,-1};
        int [] delCol={0,1,0,-1};
        dfs(image,temp,sr,sc,color,intialColor,delRow,delCol);
        return temp;

    }

    private static void dfs(int[][] image,int [] [] temp, int row, int column, int color, int intialColor, int[] delRow, int[] delCol) {
        temp[row][column]=color;
        for(int i=0;i<4;i++)
        {
            int nrow=row+delRow[i];
            int ncol=column+delCol[i];
            if(nrow>=0 && nrow<image.length && ncol>=0 && ncol<image[0].length && image[nrow][ncol]==intialColor && image[nrow][ncol]!=color)
            {
                dfs(image,temp,row,column,color,intialColor,delRow,delCol);
            }
        }

    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int intialColor=image[sr][sc];
        int [] delRow={-1,0,1,-1};
        int [] delCol={0,1,0,-1};

            Queue<Pair1> queue=new LinkedList<>();
            queue.add(new Pair1(sr,sc));
            int originalColor=image[sr][sc];



            while(!queue.isEmpty())
            {
                int row=queue.peek().row;
                int column=queue.peek().column;
                image[sr][sc]=color;
                queue.poll();
                for(int i=0;i<4;i++)
                {
                    int nrow=row+delRow[i];
                    int ncol=column+delCol[i];
                    if(nrow>=0 && nrow<image.length && ncol>=0 && ncol<image[0].length && image[nrow][ncol]==originalColor )
                    {
                        queue.add(new Pair1(nrow,ncol));
                    }
                }




            }
            return image;
        }




    public static void main(String[] args) {

    }
}
