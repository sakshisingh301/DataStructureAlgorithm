package com.company.Graph;

public class NoOfIsland {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    count++;
                    dfs(grid, i,j);
                }
            }
        }

        return count;
    } // stack overflow error
    private void dfs(char[][] grid,int i,int j)
    {
        if(i>=0 && i< grid.length && j>=0 && j<grid[0].length && grid[i][j]!=0 && grid[i][j]!=2)
        {
            grid[i][j]='2';
            dfs(grid,i+1,j);
            dfs(grid,i-1,j);
            dfs(grid,i,j+1);
            dfs(grid,i,j-1);
        }
    }

    public static void main(String[] args) {

    }
}
