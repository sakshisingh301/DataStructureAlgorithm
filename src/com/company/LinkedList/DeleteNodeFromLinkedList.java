package com.company.LinkedList;

public class DeleteNodeFromLinkedList {
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
    void deleteFromTheStart()
    {
        head=head.next;


    }

    void deleteFromEnd()
    {
        Node n=head;
        while(n.next.next!=null)
        {
          n=n.next;
        }
        n.next=null;
    }

    void deleteAtTheMiddle(int x)
    {
     Node n=head;
     Node temp=n.next;
     while(n.next.data!=x)
     {
         n=n.next;
         temp=temp.next;
     }
     n.next=temp.next;

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
        DeleteNodeFromLinkedList obj = new DeleteNodeFromLinkedList ();
        obj.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
      obj.head.next=second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        obj.deleteFromTheStart();
       // obj.deleteFromEnd();
        obj.deleteAtTheMiddle(3);
        obj.print(obj.head);




    }
}
