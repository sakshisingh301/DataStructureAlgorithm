package com.company.leetcode.dsaseries;

import com.company.LinkedList.DeleteNode;
import com.company.Tree.InorderTraversal;



public class LinkedListinBinaryTree {

    ListNode head;


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }
    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }


    public boolean isSubPath(ListNode head, TreeNode root) {

        if(root==null )
            return false;
       if(head.val== root.val)
       {
           if(check(head,root))
           {
            return true;
           }
       }
        return isSubPath(head,root.left) || isSubPath(head,root.right);

    }

    private boolean check(ListNode head, TreeNode root) {

        if(head==null)
            return true;
        if(root==null)
            return false;
        if(head.val!=root.val)
        {
            return false;
        }
        return check(head.next,root.left) ||check(head.next,root.right);

    }

    public static void main(String[] args) {

    }
}
