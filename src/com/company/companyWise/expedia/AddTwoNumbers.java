package com.company.companyWise.expedia;


   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;

        ListNode p1=l1;
        ListNode p2=l2;

        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int carry=0;

        while (p1!=null || p2!=null || carry!=0)
        {
            int x=(p1!=null)? p1.val : 0;
            int y=(p2!=null) ? p2.val : 0;
            int sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(p1!=null)
                p1=p1.next;
            if(p2!=null)
                p2=p2.next;
        }
        return dummy.next;


    }
}
