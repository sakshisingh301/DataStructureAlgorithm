package com.company.leetcode.dsaseries;



public class RotateList {
    ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;


     ListNode curr=head;
     int n=0;
     while(curr.next!=null)
     {
         n++;
         curr=curr.next;

     }
     curr.next=head;
        k=k%(n+1);
     int jump=n-k;
     curr=head;
     while(jump>0)
     {
         curr=curr.next;
         jump--;
     }
     ListNode newHead=curr.next;
     curr.next=null;




return newHead;





    }

    private static int length(ListNode head)
    {
        ListNode curr=head;
        int length=0;
        while(curr!=null)
        {
            length++;
            curr=curr.next;
        }
        return length;
    }

    public static void main(String[] args) {
        RotateList obj=new RotateList();
        obj.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth=new ListNode(5);

        obj.head.next=second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next=null;
        int k=2;
        rotateRight(obj.head,k);


    }
}
