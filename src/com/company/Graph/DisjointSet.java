package com.company.Graph;

import java.util.ArrayList;


public class DisjointSet {

    ArrayList<Integer> rank=new ArrayList<>();
    ArrayList<Integer> parent =new ArrayList<>();

    public DisjointSet(int n)
    {
        for(int i=0;i<n;i++)
        {
            rank.add(0);
            parent.add(i);
        }


    }

    public int  findParent(int node)
    {
        if(node==parent.get(node))
        {
            return node;
        }
        int storedNode=findParent(parent.get(node));
        parent.set(node,storedNode);
        return parent.get(node);
    }

    public void unionByRank(int u,int v)
    {
        int parent_u=findParent(u);
        int parent_v=findParent(v);
        if(parent_u==parent_v) return;
        if(rank.get(parent_u)<rank.get(parent_v))
        {
           parent.set(parent_v,parent_u);

        }
        else if(rank.get(parent_u)> rank.get(parent_v))
        {
            parent.set(parent_u,parent_v);
        }
        else
        {
            parent.set(parent_v,parent_u);
            int rankIndex=parent.get(parent_u);
            rank.set(parent_u,rankIndex+1);
        }

    }




    public static void main(String[] args) {

    }
}
