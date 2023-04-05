package com.company.Graph;

import java.util.Arrays;

public class NumberofWaystoArriveatDestination {

    public static int countPaths(int n, int[][] roads) {

         int [] [] dist=new int[n][n];

         int MaxInt=(int)1e9;
         for(int i=0;i<n ;i++)
         {
             Arrays.fill(dist[i],MaxInt);
             dist[i][i]=0;

         }

         for(int [] road: roads)
         {
             int u=road[0];
             int v=road[1];
             int w=road[3];
             dist[u][v]=dist[v][u]=w;
         }

         for(int k=0;k<n;k++)
         {
             for(int i=0;i<n;i++)
             {
                 for(int j=0;j<n;j++)
                 {
                     dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                 }
             }
         }


    return 0;

    }


    public static void main(String[] args) {
     int  n = 7;
     int [] []roads = {{0,6,7},{0,1,2},{1,2,3},{1,3,3},{6,3,3},{3,5,1},{6,5,1},{2,5,1},{0,4,5},{4,6,2}};

    }
}
