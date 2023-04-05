package com.company.Graph;

public class NumberofClosedIslands {

    public static int closedIsland(int[][] grid) {
        int count=0;
        int row= grid.length;
        int column=grid[0].length;

       int x1=0;
       int x2=0;
       while(x2<column)
       {
           if(grid[x1][x2]==0)
           {
               dfs(grid,0,x2);
           }
           x2++;

       }
       x2=0;
       x1=row-1;
       while(x2<column)
       {
           if(grid[x1][x2]==0)
           {
               dfs(grid,x1,x2);
           }
           x2++;
       }
       x1=0;
       while(x1<row)
       {
           if(grid[x1][column-1]==0)
           {
              dfs(grid,x1,column-1);
           }
           x1++;
       }
       x2=0;
       x1=0;
       while(x1<row)
       {
           if(grid[x1][x2]==0)
           {
               dfs(grid,x1,x2);
           }
           x1++;

       }


        for (int i=0;i< grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {

                if(grid[i][j]==0) {

                    dfs(grid, i, j);
                        count++;
                }
            }
        }
     return count;


    }

    private static void dfs(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0'||grid[i][j] == '2')
        {
            return;
        }


        grid[i][j] = '2';
        dfs(grid , i+1 , j);
        dfs(grid, i-1 , j);
        dfs(grid , i , j+1);
        dfs(grid , i , j-1);

    }

    public static void main(String[] args) {
        int [] [] grid = {{1,1,1,1,1,1,1,0},{1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}};
        closedIsland(grid);

    }
}
