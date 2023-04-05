package com.company.Tree;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {

    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res=new ArrayList<>();
        int level=1;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node= queue.poll();
                if(node!=null) {
                    temp.add(node.val);
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                }
            }
            if(level%2==0) {
                Collections.reverse(temp);
            }
            res.add(temp);
            level++;
        }
        return res;


    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size= queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node= queue.poll();
                temp.add(node.val);
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
                if(node.left!=null)
                {
                    queue.add(node.left);
                }

            }
            res.add(temp);

        }
        return res;


    }
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return false;
        Integer prev=null;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=root;
        while(curr!=null ||!stack.isEmpty())
        {
            while(curr!=null)
            {
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            if(prev!=null && curr.val<=prev)
            {
                return false;
            }
            prev=curr.val;
            curr=curr.right;
        }
        return true;

    }




    public static void main(String[] args) {

    }
}
