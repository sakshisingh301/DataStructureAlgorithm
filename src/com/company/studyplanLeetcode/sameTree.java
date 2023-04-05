package com.company.studyplanLeetcode;

import com.company.Tree.PathSum1;

public class sameTree {
    public static class Node {
        int data;
      Node right;
        Node left;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static boolean isSameTree(Node p, Node q) {
        boolean isSameTree=true;
        if(p==null && q!=null || q==null && p!=null)
        {
            isSameTree=false;
        }
        helper(p,q,isSameTree);
         return isSameTree;

    }

    private static void helper(Node p, Node q,boolean isSameTree) {
        if(p.left!=q.left || p.right!=q.right)
            isSameTree=false;
        helper(p.left,q.left,isSameTree);
        helper(p.right,q.right,isSameTree);

    }

    public static void main(String[] args) {

    }
}
