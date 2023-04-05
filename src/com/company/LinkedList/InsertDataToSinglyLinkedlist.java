package com.company.LinkedList;

public class InsertDataToSinglyLinkedlist {
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

    public  void InsertAtStart(int x)
    {
        Node new_node = new Node (x);
        new_node.next=head;
        head=new_node;
    }

    public  void InsertAtEnd(int x)
    {
        Node new_node = new Node (x);
        Node n=head;
        if(n.next==null)
        {
            n.next=new_node;
            new_node.next=null;
        }
        while(n.next!=null)
        {
        n=n.next;
        }
        n.next=new_node;
        new_node.next=null;

    }

    public  void InsertAtTheMiddle( Node prev,int x)
    {
        Node new_node = new Node (x);
        new_node.next=prev.next;
        prev.next=new_node;



    }
    public int get(int index) {
        Node n = head;
        int count = 0;
        while (n != null && count != index) {
            count++;
            if (count == index+1) {
                break;
            }
            n = n.next;
        }
        return n.data;
    }

    public void addAtIndex(int index, int val) {
        Node new_node = new Node (val);
        Node n=head;
        Node p=n.next;
        int length=0;
        while(n!=null)
        {
         length++;
         n=n.next;
        }
        n=head;
        if(length==index)
        {
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=new_node;
            new_node.next=null;
        }
        else if(length>index)
        {
            int count=0;
            while(n!=null && count != index)
            {
                count++;
                if(count==index+1)
                {
                    break;
                }
                n=n.next;
            }
            p=n.next;
            n.next=new_node;
            new_node.next=p;


        }

    }

    public void deleteAtIndex(int index) {

        Node n=head;
        int length=0;
        while(n!=null)
        {
            length++;
            n=n.next;
        }
        n=head;
        if(length==index)
        {
            while(n.next.next!=null)
            {
                n=n.next;
            }
            n.next=null;
        }
        else if (length>index)
        {
            int count=0;
            Node p=n.next;
            while (n!=null && count != index+1)
            {
                count++;
                if(count==index+1)
                {
                    break;
                }
                n=n.next;
            }
            p.next=n.next;

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
    public static void main(String[] args) {
        InsertDataToSinglyLinkedlist obj = new InsertDataToSinglyLinkedlist ();
        obj.head = new Node (1);
        Node second = new Node (2);
        Node third = new Node (3);
        Node fourth = new Node (4);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        //obj.InsertAtStart(12);
       // obj.InsertAtEnd(12);
       // obj.InsertAtTheMiddle(obj.head.next.next,8);
        //obj.print(obj.head);
      // System.out.println(obj.get(2));
       //obj.addAtIndex(8,7);
        obj.deleteAtIndex(2);
        obj.print(obj.head);

    }
}
