package com.company.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PathSum2 {
    public static class Node {
        int data;
      Node right;
        Node left;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> results=new ArrayList<>();
        helper(root,targetSum,results,new ArrayList<Integer>());
        return results;

    }

    private static void helper(Node root, int sum, List<List<Integer>> results, ArrayList<Integer> arrayList) {
        if(root==null)
            return;
        arrayList.add(root.data);
        if(root.left==null && root.right==null && root.data==sum)
        {
           results.add(arrayList);
           return;
        }
        helper(root.left,sum- root.data,results, new ArrayList<>(arrayList));
        helper(root.right,sum- root.data,results, new ArrayList<>(arrayList));

    }

    public static void main(String[] args) {
        PathSum2 pathSum=new PathSum2();
       Node root = new Node(5);
        root.left = new Node(4);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right = new Node(8);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);
        root.right.left=new Node(13);
        int sum=22;
        pathSum(root,sum);


    }
}
