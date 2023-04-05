package com.company.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class InorderTraversal {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static ArrayList<Integer> InOrderUsingStack(Node root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null)
            return new ArrayList<>();
        Node current = root;

        Stack<Node> stack = new Stack<>();
        while (current != null || stack.size() > 0) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current=stack.pop();
            arrayList.add(current.data);
            current = current.right;

        }


        return arrayList;

    }

    public static void main(String[] args) {
        InorderTraversal obj = new InorderTraversal();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        InOrderUsingStack(root);

    }
}
