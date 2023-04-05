package com.company.challenge;

import com.company.Tree.BinaryTreeZigzagLevelOrderTraversal;
import com.company.Tree.InorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RangeSumofBST {

    public static class TreeNode {
        int val;
     TreeNode right;
     TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int rangeSum=0;
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode > stack=new Stack<>();
        TreeNode curr=root;
        while (curr!=null || stack.size()>0)
        {
         while (curr!=null)
         {
             stack.push(curr);
             curr=curr.left;
         }
         curr=stack.pop();
         list.add(curr.val);
         curr=curr.right;
        }

        for (int i=0;i<list.size();i++)
        {
            if(list.get(i)>=low  && list.get(i)<high)
            {
                rangeSum=rangeSum+ list.get(i);
            }
        }
        return rangeSum;
    }

    }

    public int rangeSumBST1(TreeNode root, int low, int high) {

        if(root==null)
            return 0;
        if(root.val>=low && root.val<=high)
        {
            return root.val+rangeSumBST1(root.left,low,high)+rangeSumBST1(root.right,low,high);
        }
        else if(root.val<low)
        {
          return rangeSumBST1(root.right,low,high);
        }
        else
        {
            return rangeSumBST1(root.left,low,high);
        }

    }

    public static void main(String[] args) {

    }
}
