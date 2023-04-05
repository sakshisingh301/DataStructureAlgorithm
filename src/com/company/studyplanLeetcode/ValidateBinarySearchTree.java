package com.company.studyplanLeetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidateBinarySearchTree {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static boolean isValidBST(Node root) {

        List<Integer> list=new ArrayList<>();
        boolean isValidBST=true;
        Node curr=root;
        if(root==null)
            return isValidBST;
        Stack<Node> stack=new Stack<>();

        while(curr != null || stack.size() > 0)
        {
           while(curr!=null)
           {
               stack.push(curr);
               curr=curr.left;
           }
            curr=stack.pop();
            list.add(curr.data);
            curr = curr.right;
        }
        int i=0;
        while (i< list.size()-1)
        {
            if(list.get(i)>=list.get(i+1))
            {
                isValidBST=false;

            }
            i++;
        }
        return isValidBST;
    }



    public static void main(String[] args) {
        ValidateBinarySearchTree obj = new ValidateBinarySearchTree();
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        isValidBST(root);



    }
}
