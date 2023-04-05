package com.company.studyplanLeetcode;


import java.util.*;

public class NaryTreePreorderTraversal {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    public static List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> result=new ArrayList<>();

        if(root==null)
            return result;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            List<Integer> intermediate=new ArrayList<>();
            int queueSize= queue.size();
            for(int i=0;i<queueSize;i++)
            {

                intermediate.add(queue.peek().data);
                Node curr=queue.poll();
                if(curr.left!=null)
                {
                    queue.add(curr.left);
                }
                if(curr.right!=null)
                {
                    queue.add(curr.right);
                }
            }
            result.add(intermediate);


        }
      return result;

    }

    public static void main(String[] args) {
        NaryTreePreorderTraversal obj=new NaryTreePreorderTraversal();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(4);
        root.right.right=new Node(5);
        levelOrder(root);



    }
}
