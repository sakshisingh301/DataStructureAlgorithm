package com.company.leetcode.dsaseries;



public class RemoveDuplicatesfromSortedList {
    Node head;
    Node End;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public Node deleteDuplicates(Node head) {

        Node curr=head;

        while(curr!=null)
        {
            if(curr.data== curr.next.data)
            {
                curr.next=curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        return curr;


    }


    public Node middleNode(Node head) {

        if(head==null)
        {
            return null;
        }

        Node slow=head;
        Node fast=head;
        Node curr=head;
        int length=0;
        while(curr!=null)
        {
            length++;
            curr=curr.next;
        }

        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        if(length%2==0) {
            return slow.next;
        }
        else
        {
            return slow;
        }

    }

    public Node removeNthFromEnd(Node head, int n) {

        Node curr=head;
        for(int i=0;i<n;i++)
        {
            curr=curr.next;
        }
        if(curr==null)
        {
            return head.next;
        }
        Node afterCurr=head;
        while(curr.next!=null)
        {
            afterCurr=afterCurr.next;
            curr=curr.next;
        }
        afterCurr.next=afterCurr.next.next;
        return head;

    }

    public static void main(String[] args) {

    }
}
