package com.company.LinkedList;

import java.util.HashSet;

public class LinkedListCycleII {


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
        public Node detectCycle(Node head) {

            Node slow = head, fast = head;
            Node p=head;
            Node q=head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    p = slow;
                    break;
                }

            }
            System.out.println(p);
            while(p!=q)
            {
                p=p.next;
                q=q.next;
            }

            return p;




        }
        public Node intersection( Node headA,Node headB)
        {
            int lengthHeadA=findLength(headA);
            int lengthHeadB=findLength(headB);
            Node p=headA;
            Node q=headB;
            if(lengthHeadA<lengthHeadB)
            {
                int diff=lengthHeadB-lengthHeadA;
                while(q!=null && diff!=0)
                {
                  q=q.next;
                  diff--;
                }

            }
            else
            {
                int diff=lengthHeadB-lengthHeadA;
                while(p!=null && diff!=0)
                {
                    p=p.next;
                    diff--;
                }
            }
            while(p!=q)
            {

                p=p.next;
                q=q.next;
            }
          if(p!=null)
              return p;
          else
              return null;
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
        public static void main(String[] args) {
            LinkedListCycleII obj=new LinkedListCycleII();
            obj.head = new Node(4);
            Node second = new Node(1);
            Node third = new Node(8);
           Node fourth = new Node(4);
           Node fifth=new Node(5);
            LinkedListCycleII obj1=new LinkedListCycleII();
            obj1.head = new Node(5);
            Node second1 = new Node(6);
            Node third1 = new Node(1);
            Node fourth1 = new Node(8);
            Node fifth1 = new Node(8);
            Node sixth = new Node(8);
            obj.head.next=second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            fifth.next=null;
            obj1.head.next=second1;
            second1.next = third1;
            third1.next = fourth1;
            fourth1.next = fifth1;
            fifth1.next=sixth;
            sixth.next=null;
            //obj.intersection()

     //       obj.detectCycle(obj.head);
        }



    }


