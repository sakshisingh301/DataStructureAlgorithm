package com.company.Graph;

public class NumberofEnclaves1 {

    public static int numEnclaves(int[][] grid) {

        int row= grid.length;
        int column=grid[0].length;
        int count=0;

       for(int i=0;i<grid.length;i++)
       {
           for(int j=0;j<grid[0].length;j++)
           {
               if(i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1 && grid[i][j]==1)
               {
                   dfs(grid,i,j);
               }
           }
       }

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
              if(grid[i][j]==1)
              {
                 count++;
              }
            }
        }
        return count;

    }
    private static void dfs(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0||grid[i][j] == 2)
        {
            return;
        }


        grid[i][j] = 2;

        dfs(grid , i+1 , j);
        dfs(grid, i-1 , j);
        dfs(grid , i , j+1);
        dfs(grid , i , j-1);

    }


    public static void main(String[] args) {
        int [] [] grid = {{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
        numEnclaves(grid);

    }
}
