package com.company.leetcode.dsaseries;

import java.util.HashMap;

public class CopyListwithRandomPointer {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static Node copyRandomList(Node head) {
        int length=length(head);
        Node curr=head;
        Node dummy=new Node(0);



        HashMap<Integer,Node> visited=new HashMap<>();
        for(int i=0;i<length;i++)
        {
            Node newNode=new Node(curr.val);
            dummy.next=newNode;
            newNode.next=curr.next;

            if (visited.containsKey(curr.random.val)  )
            {
                newNode.random= visited.get(i);

            }
            else
            {
                newNode.random=curr.random;
            }
            visited.put(i, curr);

            curr=curr.next;
            newNode=newNode.next;
        }



        return dummy.next;


    }
    public static int length(Node head)
    {
        Node curr=head;

        int length=0;
        while(curr!=null)
        {
            length++;
            curr=curr.next;
        }
        return length;
    }

    public static void main(String[] args) {



    }
}
