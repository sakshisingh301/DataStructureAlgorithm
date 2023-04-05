package com.company.Graph;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<heights.length;i++)
        {
            for(int j=0;j<heights[0].length;j++)
            {
                dfs(heights,i,j,new ArrayList<Integer>());
            }
        }
        return list;

    }

    private void dfs(int[][] heights, int i, int j, ArrayList<Integer> arrayList) {




    }

    public static void main(String[] args) {

    }
}
