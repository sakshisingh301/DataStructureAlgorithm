package com.company.leetcode.dsaseries;

import java.util.ArrayList;
import java.util.List;

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

public class BSTIterator {


    private List<Integer> list=new ArrayList<>();
    private int position=0;
    public BSTIterator(TreeNode root) {

      list=inorder(root,list);

    }

    private List<Integer> inorder(TreeNode root,List<Integer> list) {
        List<Integer> temp=new ArrayList<>();

        if(root==null)
            return temp ;
        temp.addAll(inorder(root.left, temp));
        temp.add(root.val);
        temp.addAll(inorder(root.right, temp));
       return temp;

    }

    public int next() {
        return list.get(position++);

    }

    public boolean hasNext() {
        return position< list.size();

    }
}

