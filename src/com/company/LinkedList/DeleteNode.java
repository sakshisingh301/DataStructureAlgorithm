package com.company.LinkedList;

public class DeleteNode {
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
    void print (Node head)
    {
        Node n = head;
        while (n != null)
        {
            System.out.println (n.data);
            n = n.next;
        }
    }
    public Node middle(Node node) {
        Node result=null;
        Node curr=head;
        int length=0;
        while (curr!=null)
        {
            length++;
            curr=curr.next;
        }
        curr=head;
        int middle=(length%2==0)?(length/2)+1: length/2;
        int middleCount=0;

        while(curr!=null)
        {
            middleCount++;
            if(middle==middleCount)
            {
                result= curr;
            }
            curr=curr.next;
        }


    return result;



    }

    public static void main(String[] args) {
        DeleteNode obj=new DeleteNode();
        obj.head = new Node(1);
       Node second = new Node(2);
        Node third = new Node(3);
      Node fourth = new Node(4);
        Node fifth = new Node(5);
        obj.head.next=second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next=null;
        // obj.deleteFromTheStart();
        // obj.deleteFromEnd();
        obj.middle(obj.head);

       // obj.print(obj.head);
    }
}
