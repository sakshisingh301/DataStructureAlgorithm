package com.company.challenge;



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeafSimilarTrees {
    public static class TreeNode {
        int val;
       TreeNode right;
       TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }



    }

    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(3);
        treeNode1.left=new TreeNode(5);
        treeNode1.right=new TreeNode(1);
        treeNode1.left.left=new TreeNode(6);
        treeNode1.left.right=new TreeNode(2);
        treeNode1.left.right.left=new TreeNode(7);
        treeNode1.left.right.right=new TreeNode(4);
        treeNode1.right.left=new TreeNode(9);
        treeNode1.right.right=new TreeNode(8);
        TreeNode treeNode2=new TreeNode(3);
        treeNode2.left=new TreeNode(5);
        treeNode2.right=new TreeNode(1);
        treeNode2.left.left=new TreeNode(6);
        treeNode2.left.right=new TreeNode(7);

        treeNode2.right.left=new TreeNode(4);
        treeNode2.right.right=new TreeNode(2);
        treeNode2.right.right.right=new TreeNode(8);
        treeNode2.right.right.left=new TreeNode(9);
        leafSimilar(treeNode1,treeNode2);




    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null || root2==null)
            return false;
        List<Integer> list1=inorderTraversal(root1);
        List<Integer> list2=inorderTraversal(root2);
        if(list1.size()!=list2.size())
            return false;

        for(int i=0;i<list1.size();i++)
        {
            if(!list1.get(i).equals(list2.get(i)))
            {
                return false;
            }
        }
        return true;

    }

    public static List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();

        TreeNode curr=root;
        while(!stack.isEmpty() || curr!=null)
        {
            while(curr!=null)
            {
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            if(curr.left==null && curr.right==null)
                res.add(curr.val);
            curr=curr.right;

        }
        return res;

    }
}
