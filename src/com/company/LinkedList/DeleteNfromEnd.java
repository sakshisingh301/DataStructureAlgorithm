package com.company.LinkedList;

public class DeleteNfromEnd {
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
    private int findLength(Node head)
    {
        int length=0;
        Node curr=head;
        while(curr!=null)
        {
            length++;
            curr=curr.next;
        }
        return length;
    }

    public static Node shiftLinkedList(Node head, int k) {
       Node curr=head;
       int last=0;
       Node newHead=null;
       int steps=0;
       Node p=null;
       int count=0;
       int length=0;
        while(curr!=null)
        {
            length++;
            curr=curr.next;
        }
        curr=head;
        if(k<0)
        {
            k=k%length;
            k=length+k;
        }



       if(k>length) {
           steps = k % length;
           if(steps==0)
           {
               return head;
           }
           last = length - steps;
       }
       else {
           steps = length - k;
           last=steps;
       }
       while(curr!=null)
       {
           count++;
           if(count==last)
           {
              break;
           }
           curr=curr.next;
       }
       newHead=curr.next;
       curr.next=null;
       p=newHead;
       while(p.next!=null)
       {
           p=p.next;
       }
       p.next=head;
       return newHead;


    }

    public Node deleteN(Node head, int n)
    {
        Node curr=head;
        if(head==null)
            return null;
        if(head.next==null)
            return null;




        int length=findLength(head);
        int index=length-n;
        if(n==length)
        {
           head=head.next;
        }
        else {
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }

        return head;
    }

        static void print (Node head)
    {
        Node n = head;
        while (n != null)
        {
            System.out.println (n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        DeleteNfromEnd obj=new DeleteNfromEnd();
        int k=-2;
        obj.head = new Node(0);
       Node second = new Node(1);
       Node third = new Node(2);
        Node fourth = new Node(3);
        Node fifth=new Node(4);
        Node sixth=new Node(5);
        obj.head.next=second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next=sixth;
        sixth.next=null;
        shiftLinkedList(obj.head,k);
        print(obj.head);




    }
}
