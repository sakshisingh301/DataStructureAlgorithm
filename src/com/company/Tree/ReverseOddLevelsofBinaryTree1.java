package com.company.Tree;

import java.util.*;

public class ReverseOddLevelsofBinaryTree1 {
    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }

    public TreeNode reverseOddLevels(TreeNode root) {
            if(root==null) return root;
            int level=0;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {

            int size= queue.size();
            List<Integer> temp=new ArrayList<>();

            for(int i=0;i<size;i++)
            {
                TreeNode curr= queue.poll();
                if(curr.left!=null)
                {
                    queue.add(curr.left);
                    temp.add(curr.left.val);
                }
                if(curr.right!=null)
                {
                    queue.add(curr.right);
                    temp.add(curr.right.val);
                }

            }
            level++;
            if(level%2!=0)
            {
                Collections.reverse(temp);
                int i=0;
            for(TreeNode curr :queue)
            {
                curr.val=temp.get(i);
                i++;
            }
            }

        }
        return root;

    }

    }


    public static void main(String[] args) {

    }
}
