package com.company.companyWise.expedia;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {

        boolean[][] isZero=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    isZero[i][j]=true;
                }
            }
        }

        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(isZero[i][j])
                {
                    makeColumnZero(matrix,j);
                    makeRowZero(matrix,i);
                }
            }
        }



    }
    private void makeColumnZero(int [] [] matrix,int column)
    {
        for (int i=0;i<matrix[0].length;i++)
        {
            matrix[i][column]=0;
        }
    }

    private void makeRowZero(int [] [] matrix,int row)
    {
        for(int i=0;i<row;i++)
        {
            matrix[row][i]=0;
        }
    }



    public static void main(String[] args) {
       int [][] matrix= {{1,1,1},{1,0,1},{1,1,1}};
    }
}
