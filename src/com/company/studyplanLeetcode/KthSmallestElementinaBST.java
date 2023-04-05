package com.company.studyplanLeetcode;

import com.company.Tree.InorderTraversal;

import java.util.ArrayList;
import java.util.Stack;

public class KthSmallestElementinaBST {
    public static class Node {
        int data;
       Node right;
     Node left;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int kthSmallest(Node root, int k) {
        if(root==null)
            return 0;
        int kthSmallest=0;
        Stack<Node> stack=new Stack<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        Node curr=root;
        while(stack.size()>0 || curr!=null)
        {
         while(curr!=null)
         {
             stack.push(curr);
             curr=curr.left;
         }
         curr=stack.pop();
         arrayList.add(curr.data);
         curr=curr.right;

        }
        for(int i=0;i<arrayList.size();i++)
        {
           if(k==i+1) {
               kthSmallest = arrayList.get(i + 1);
               break;
           }
        }

  return kthSmallest;
    }

    public static void main(String[] args) {
        KthSmallestElementinaBST obj=new KthSmallestElementinaBST();
       Node root = new Node(3);
       root.left=new Node(1);
       root.right=new Node(2);
        root.left.right=new Node(2);
        int k=1;
        System.out.println(kthSmallest(root,k));





    }
}
