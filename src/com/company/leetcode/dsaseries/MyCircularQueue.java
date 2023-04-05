package com.company.leetcode.dsaseries;

 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class MyCircularQueue {


     private Node head;
     private int size;
    private int capacity;


    public MyCircularQueue(int k) {
        this.capacity=k;

    }

    public boolean enQueue(int value) {
        Node node=new Node(value);

        if(size==0)
        {
         node.next=head;
         head=node;
         size++;
         return true;
        }
        else
        {
            Node curr=head;
         while(curr.next!=null)
         {
             curr=curr.next;
         }
         curr.next=node;
         node.next=head;
         size++;
         return true;

        }


    }

    public boolean deQueue() {


        if(head==null) return false;
        head=head.next;
        size--;
        return true;



    }

    public int Front() {

        if(head==null)
         return -1;
        return head.data;
    }

    public int Rear() {
        if(head==null) return -1;
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        return curr.data;

    }

    public boolean isEmpty() {
        return head!=null;

    }

    public boolean isFull() {
        return size==capacity;

    }
}

