package com.company.Graph;

public class CountSubIsland {

    public static int countSubIslands(int[][] grid1, int[][] grid2) {
        int countSubIslands=0;

        for (int i=0;i<grid1.length;i++)
        {
            for(int j=0;j<grid1[0].length;j++)
            {
                if(grid1[i][j]==1)
                {
                    dfs(grid1,i,j);
                }
            }
        }

        for(int i=0;i<grid2.length;i++)
        {
            for(int j=0;j<grid2[0].length;j++)
            {
                if(grid2[i][j]==1)
                {
                    if(dfsForGrid2(grid1,i,j,grid2))
                    countSubIslands++;
                }
            }
        }

    return countSubIslands;

    }

    private static void dfs(int[][] grid1, int i, int j) {

        if(i<0 || i>=grid1.length || j<0 || j>=grid1[0].length || grid1[i][j]==0 || grid1[i][j]==2)
        {
            return;
        }
        grid1[i][j]=2;
        dfs(grid1 , i+1 , j);
        dfs(grid1, i-1 , j);
        dfs(grid1 , i , j+1);
        dfs(grid1 , i , j-1);
    }

    private static boolean dfsForGrid2(int[][] grid1, int i, int j, int[][] grid2) {
        if(i<0 || i>=grid2.length || j<0 || j>=grid2[0].length || grid2[i][j]==0 )
        {
            return true;
        }
        if( grid1[i][j]!=2)
            return false;
        grid2[i][j]=2;
         boolean bottom=dfsForGrid2(grid1 , i+1 , j,grid2);
        boolean top=dfsForGrid2(grid1, i-1 , j,grid2);
        boolean right=dfsForGrid2(grid1 , i , j+1,grid2);
        boolean left=dfsForGrid2(grid1 , i , j-1,grid2);
        return bottom && top && right && left;



    }

    public static void main(String[] args) {
       int [] [] grid1 = {{1,1,1,0,0},{0,1,1,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}};
       int [] [] grid2 = {{1,1,1,0,0},{0,0,1,1,1},{0,1,0,0,0},{1,0,1,1,0},{0,1,0,1,0}};
       countSubIslands(grid1,grid2);


    }
}
