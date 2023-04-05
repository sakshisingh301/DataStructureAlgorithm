package com.company.Tree;

public class ClosestBinarySearchTreeValue {
    static class TreeNode {
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
    double diff;
    int res=0;
    public  int closestValue(TreeNode root, double target) {
        dfs(root,target);

     return res;


    }

    private void dfs(TreeNode root, double target) {

        if(root==null) {
            return;
        }
      if(diff>Math.abs(Math.abs(root.val)-Math.abs(target)))
      {
          res= root.val;
          diff=Math.abs(root.val)-Math.abs(target);
      }
      if(root.val<target)
      {
          dfs(root.right,target);
      }
      else if(root.val>target)
      {
          dfs(root.left,target);
      }

    }

    public static void main(String[] args) {
        ClosestBinarySearchTreeValue closestBinarySearchTreeValue=new ClosestBinarySearchTreeValue();
        double target=3.714286;
        TreeNode treeNode=new TreeNode(4);
        treeNode.left=new TreeNode(2);
        treeNode.right=new TreeNode(7);
        treeNode.left.left=new TreeNode(1);
        treeNode.left.right=new TreeNode(3);




    }
}
