package com.company.Tree;

import java.util.Stack;

public class PathSum1 {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static boolean hasPathSum(Node root, int targetSum) {


        Stack<Node> stack1=new Stack<>();
        Stack<Integer> valueStack=new Stack<>();

        stack1.push(root);
        valueStack.push(root.data);
        while(!stack1.isEmpty())
        {
            Node temp=stack1.pop();
            int tempVal=valueStack.pop();
            if(temp.left==null && temp.right==null)
            {
                if(tempVal==targetSum)
                {
                    return true;
                }
            }
            else
            {
                if(temp.left!=null)
                {
                    stack1.push(temp.left);
                    valueStack.push(tempVal+temp.left.data);

                }
                if(temp.right!=null)
                {
                    stack1.push(temp.right);
                    valueStack.push(tempVal+temp.right.data);

                }
            }

        }

     return  false;
    }

    public static void main(String[] args) {
        PathSum1 pathSum=new PathSum1();
        Node root = new Node(5);
        root.left = new Node(4);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right = new Node(8);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);
        root.right.left=new Node(13);
        int sum=22;
        hasPathSum(root,sum);


    }
}
