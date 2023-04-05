package com.company.leetcode.dsaseries;

import com.company.LinkedList.DeleteNfromEnd;

public class ReorderList {
    ListNode head;
    static class ListNode {
        int val;
       ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    public static void reorderList(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;
        ListNode l1=head;
        while (fast!=null &&fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }

     temp.next=null;
        ListNode l2=reverse(slow);
        merge(l1,l2);




    }

    private static void merge(ListNode l1, ListNode l2) {

        while(l1!=null)
        {
            ListNode l1_next=l1.next;
            ListNode l2_next=l2.next;

            l1.next=l2;

            if(l1_next==null)
             break;

            l1=l1_next;
            l2=l2_next;

        }

    }

    private static ListNode reverse(ListNode head) {

        ListNode curr=head;
        ListNode prev=null;
        ListNode currNext=head;
        while(curr!=null)
        {
           currNext=curr.next;
         curr.next=prev;
         prev=curr;
         curr=currNext;


        }
        return prev;
    }

    public static void main(String[] args) {

        ReorderList obj=new ReorderList();

        obj.head = new ReorderList.ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth=new ListNode(5);

        obj.head.next=second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        fifth.next=null;
        reorderList(obj.head);


    }
}
