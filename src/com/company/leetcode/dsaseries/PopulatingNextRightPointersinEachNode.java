package com.company.leetcode.dsaseries;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode {
    public static class Node {
        int val;
        Node right;
       Node left;
       Node next;


        Node(int val,Node next) {
            this.val = val;
            next = next;
            left = right = null;
        }
    }
    public Node connect(Node root) {

        if(root==null)
            return null;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                Node node =queue.poll();
                if(i==size-1)
                {
                    node.next= queue.peek();
                }
                if(node.left!=null)
                {
                    queue.add(node);
                }
                if(node.right!=null)
                {
                    queue.add(node);
                }
            }
        }
      return root;


    }

    public static void main(String[] args) {

    }
}
