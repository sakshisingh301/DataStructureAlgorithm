package com.company.algoexpert;


import com.company.Tree.InorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BranchSum {

    public static class Node {
        int data;
      Node right;
       Node left;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }


    public static List<Integer> branchSums(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        Node temp=root;
        Node temp2=root;
        Stack<Node> extra=new Stack<>();
        Stack<Node> stack=new Stack<>();
        Node curr=root;
        while(!stack.isEmpty() || curr!=null)
        {
            while(curr!=null)
            {
                sum=sum+ curr.data;
                stack.push(curr);
                temp2=curr;
                curr=curr.left;
            }
            temp=stack.peek();
            if(temp.left==null && temp.right==null)
            {
                list.add(sum);
            }

            sum=sum- temp.data;
            curr=stack.pop();
            extra.push(curr);
             if(extra.peek().left!=null || extra.peek().right!=null)
             {
               sum=sum+extra.peek().data;
             }


            curr=curr.right;

        }
        return list;
    }
    public static void main(String[] args) {
        BranchSum branchSum=new BranchSum();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.right.left=new Node(6);
        root.right.right=new Node(7);


        branchSums(root);

    }
}
