package com.company.LinkedList;

public class OddEvenLinkedList {
    ListNode head;
    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
            next = null;
        }
    }
    public ListNode oddEvenList(ListNode head) {
         int count=0;
        ListNode evenStart=null;
        ListNode evenEnd=null;
        ListNode oddStart=null;
        ListNode oddEnd=null;
        ListNode curr=head;
        while(curr!=null)
        {
            count++;
            if(count%2!=0)
            {
                if(oddStart==null)
                {
                    oddStart=curr;
                    oddEnd=curr;
                }
                else {
                    oddEnd.next=curr;
                    oddEnd=oddEnd.next;
                }
            }
            else
            {
                if(evenStart==null)
                {
                    evenStart=curr;
                    evenEnd=curr;
                }
                else
                {
                    evenEnd.next=curr;
                    evenEnd=evenEnd.next;
                }
            }
            curr=curr.next;

        }
        oddEnd.next=evenStart;
        evenEnd.next=null;
        return head;


    }

    public static void main(String[] args) {
        OddEvenLinkedList obj=new OddEvenLinkedList();

        obj.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth=new ListNode(5);
        ListNode sixth=new ListNode(6);
        obj.head.next=second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next=sixth;
        sixth.next=null;

    }
}
