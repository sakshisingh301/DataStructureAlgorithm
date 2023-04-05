package com.company.LinkedList;



public class DeleteNodeThatAreGreaterThanK {
   Node head;


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

        public static Node deleteGreaterNodes(Node head, int x) {

        Node curr=head;
        while(curr!=null && curr.data>x)
        {
            curr=curr.next;
            head=curr;
        }
        curr=head;
        Node prev=curr;

        while(curr!=null)
        {
            if(curr.data>x)
            {
                prev.next=curr.next;
                curr=curr.next;

            }
            else
            {
                prev=curr;
                curr=curr.next;

            }
        }
//            int headVal= head.data;
//
//            Node curr=head;
//            Node prev=null;
//
//            while(curr!=null)
//            {
//
//                if ( curr.data>x )
//                {
//                    if(curr.data==headVal ) {
//                        curr = curr.next;
//                        head=curr;
//
//                    }
//                    else {
//
//                            prev.next=curr.next;
//                            curr=curr.next;
//
//                    }
//                    prev=curr;
//
//
//                }
//                else {
//                    prev=curr;
//                    curr=curr.next;
//                }
//
//
//
//
//
//
//
//
//            }
            return head;

        }




    public static void main(String[] args) {
        DeleteNodeThatAreGreaterThanK obj=new DeleteNodeThatAreGreaterThanK();
        obj.head = new Node(7);
      Node second = new Node(3);
       Node third = new Node(4);
        Node fourth = new Node(8);
        Node fifth=new Node(5);
        Node sixth=new Node(1);
        obj.head.next=second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next=sixth;
        sixth.next=null;
        int x=6;
     deleteGreaterNodes(obj.head, x);




    }
}
