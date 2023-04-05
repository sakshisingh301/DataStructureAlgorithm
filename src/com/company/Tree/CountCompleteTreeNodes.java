package com.company.Tree;
   class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {


        if(root==null) return 0;
        int depthLeft=computeDepthLeft(root.left);
        int depthRight=computeDepthRight(root.right);
        if(depthLeft==depthRight)
            return (int)Math.pow(2,depthLeft)-1;
         else return countNodes(root.left) +countNodes(root.right)+1;


    }

    public int computeDepthLeft(TreeNode node)
    {
      int d=0;
        while (node.left!=null)
        {
            d++;
            node=node.left;
        }
        return d;
    }

    public int computeDepthRight(TreeNode node)
    {
        int d=0;
        while (node.right!=null)
        {
            d++;
            node=node.right;
        }
        return d;
    }
}
