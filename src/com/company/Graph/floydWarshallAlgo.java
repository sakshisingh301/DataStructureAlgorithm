package com.company.Graph;
//stores ultimate shortest distance from each node for each node

public class floydWarshallAlgo {

    public void shortestPath(int [] [] matrix)
    {
      int n=matrix.length;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==-1)
                {
                    matrix[i][j]=(int)1e9;
                }
                if(i==j)
                {
                    matrix[i][j]=0;
                }
            }
        }

        for(int k=0;k<n;k++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    matrix[i][j]=Math.min(matrix[i][j],matrix[i][k]+matrix[k][j]);// formula
                }
            }
        }



        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==(int)1e9)
                {
                    matrix[i][j]=-1;
                }
                if(i==j)
                {
                    matrix[i][j]=0;
                }
            }
        }




    }

    public static void main(String[] args) {

    }
}
