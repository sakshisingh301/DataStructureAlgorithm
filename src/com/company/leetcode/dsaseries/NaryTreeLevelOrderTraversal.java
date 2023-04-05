package com.company.leetcode.dsaseries;

import com.company.Tree.InorderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            List<Integer> intermediate=new ArrayList<>();
            int size=queue.size();

            for(int i=0;i<size;i++) {

                Node curr=queue.poll();
                intermediate.add(curr.val);
                queue.addAll(curr.children);

            }
            list.add(intermediate);

        }

    return list;

    }

    public static void main(String[] args) {

    }
}
