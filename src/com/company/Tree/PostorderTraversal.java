package com.company.Tree;

import java.util.ArrayList;
import java.util.Stack;

public class PostorderTraversal {
    public static class Node {
        String data;
        Node right;
       Node left;

        public Node(String data) {
            this.data = data;
            left=right=null;
        }
    }

    public static ArrayList<String> PostOrderUsingStack(Node root)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        if (root == null)
            return new ArrayList<>();
        Node current=root;
        while(true)
        {
            if(current!=null)
            {
             stack.push(current);
             current=current.left;
            }
            else {
                if(stack.size()==0)
                {
                    break;
                }
                else {
                    if(stack.peek().right==null)
                    {
                        current=stack.pop();
                        arrayList.add(current.data);
                        while(current==stack.peek().right)
                        {
                            arrayList.add(stack.peek().data);
                            current=stack.pop();
                        }
                    }
                    if(!stack.isEmpty())
                    {
                        current=stack.peek().right;
                    }
                    else
                    {
                        current=null;
                    }

                }

            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        PostorderTraversal obj = new PostorderTraversal();
       Node root = new Node("a");
        root.left = new Node("b");
        root.left.left = new Node("c");
        root.left.right = new Node("k");
        root.left.right.left = new Node("e");
        root.left.right.right = new Node("f");
        root.left.right.right.right = new Node("g");
        root.left.left.left = new Node("d");
        root.right = new Node("m");
        root.right.left = new Node("n");
        root.right.right = new Node("p");
        root.right.right.right = new Node("q");
        System.out.println(PostOrderUsingStack(root));

    }
}
