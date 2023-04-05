package com.company.studyplanLeetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    public static class Node {
        int data;
     Node right;
     Node left;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public List<Integer> rightSideView(Node root) {
        List<Integer> list=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            int size= queue.size();
            for(int i=0;i<size;i++)
            {
               Node temp= queue.remove();
               if(i==size-1)
               {
                   list.add(temp.data);
               }
               if(temp.left!=null)
               {
                   queue.add(temp.left);
               }
                if(temp.right!=null)
                {
                    queue.add(temp.right);
                }
            }
        }
   return list;

    }

    public static void main(String[] args) {

    }
}
