package com.company.Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MinimumKnightMoves {
    private final int[][] DIRECTIONS = new int[][] {{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};

    public int minKnightMoves(int x, int y) {
        Queue<int []> queue=new LinkedList<>();
        Set<String> visited=new HashSet<>();
        queue.add(new int[]{0,0});
        visited.add("0,0");
        int count=0;

        while (!queue.isEmpty())
        {
            int size= queue.size();
            for(int i=0;i<size;i++)
            {
                int [] curr=queue.remove();
                int currX=curr[0];
                int currY=curr[1];
                if(currX==x && currY==y)
                {
                    return count;
                }
                for(int [] dir:DIRECTIONS)
                {
                    int newX=currX+dir[0];
                    int newY=currY+dir[1];
                    if(!visited.contains(newX + ","+newY) &&newX>-1 && newY>-1 )
                    {
                        queue.add(new int[]{newX,newY});
                        visited.add(newX +"," +newY);
                    }
                }
            }
            count++;
        }
        return count;


    }

    public static void main(String[] args) {

        int x = 2;
        int y = 1;

    }
}
