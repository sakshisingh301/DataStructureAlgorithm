package com.company.studyplanLeetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int [][] temp=new int[r][c];
        Queue<Integer> queue=new LinkedList<>();

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                queue.add(mat[i][j]);
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                temp[i][j]= queue.remove();
            }
        }
      return temp;

    }

    public static void main(String[] args) {
        int [][]mat = {{1,2},{3,4}};
        int r = 1;
        int  c = 4;
    }
}
