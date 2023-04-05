package com.company.LinkedList;

public class ReverseLinkedList {

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

    public Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node nextCurr=head;
        while(curr!=null)
        {
            nextCurr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextCurr;
        }
        head=prev;
        return head;
//        Node p=head;
//        Node prev=null;
//        Node temp=head;
//        while(p!=null )
//        {
//            temp=p.next; //storing the next node address in temp for next iteration
//            p.next=prev;
//            prev=p;
//            p=temp;
//
//        }
//        head=prev;
//        return head;
    }

    void print (Node head)
    {
        Node n = head;
        while (n != null)
        {
            System.out.println (n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList obj=new ReverseLinkedList();
        obj.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        obj.head.next=second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        obj.reverse(obj.head);
        obj.print(obj.head);


    }
}
