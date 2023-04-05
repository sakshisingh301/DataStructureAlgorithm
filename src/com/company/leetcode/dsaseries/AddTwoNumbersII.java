package com.company.leetcode.dsaseries;

public class AddTwoNumbersII {

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
        int carry=0;
        ListNode p1=reverse(l1);

        ListNode p2=reverse(l2);

        ListNode dummyNode =new ListNode(0);
        ListNode curr=dummyNode;

        while (p1!=null || p2!=null  || carry!=0)
        {
            int x=(p1!=null)?p1.val:0;
            int y=(p2!=null)?p2.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(p1!=null) p1=p1.next;
            if(p2!=null) p2=p2.next;
        }
       ListNode result=reverse(dummyNode.next);
       return result;

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
}
