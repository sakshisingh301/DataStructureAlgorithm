package com.company.leetcode.dsaseries;

import com.company.LinkedList.DeleteNodeFromLinkedList;

public class AddTwoNumbers {
    ListNode head;
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode dummyHead=new ListNode(0);
        ListNode curr=dummyHead;
        int carry=0;

        while (p1!=null || p2!=null ||carry!=0)
        {
           int x=(p1!=null)?p1.val:0;
            int y=(p2!=null)?p2.val:0;
            int sum=x+y+carry;

                 carry=sum/10;
                curr.next=new ListNode(sum%10);

            curr=curr.next;
          if(p1!=null) {
              p1 = p1.next;
          }
          if(p2!=null) {
              p2 = p2.next;
          }
        }
        return dummyHead.next;

    }

    public static void main(String[] args) {

        AddTwoNumbers obj1 = new AddTwoNumbers ();
        obj1.head = new ListNode(0);
//        ListNode second = new ListNode(4);
//        ListNode third = new ListNode(3);

        obj1.head.next=null;
//        second.next = third;
//        third.next = null;
        AddTwoNumbers obj2 = new AddTwoNumbers ();
        obj2.head = new ListNode(0);
//        ListNode second2 = new ListNode(6);
//        ListNode third2 = new ListNode(4);

        obj2.head.next=null;
//        second2.next = third;
//        third2.next = null;
        addTwoNumbers(obj1.head,obj2.head);


    }
}
