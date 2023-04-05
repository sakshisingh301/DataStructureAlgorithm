package com.company.companyWise.expedia;

public class MaxAreaofIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    max=Math.max(max,dfs(i,j,grid));
                }
            }
        }
        return max;

    }

    private int dfs(int i, int j, int[][] grid) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 || grid[i][j]==2)
        {
            return 0;
        }
        grid[i][j]=2;
        return 1+dfs(i+1,j,grid)+ dfs(i,j+1,grid) +dfs(i-1,j,grid) +dfs(i,j-1,grid);


    }

    public static void main(String[] args) {

    }
}
