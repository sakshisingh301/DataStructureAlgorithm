package com.company.LinkedList;

public class SortList {

    public ListNode sortList(ListNode head) {

        ListNode temp=null;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
        ListNode firstList=sortList(head);
        ListNode secondList=sortList(slow);
        return merge(firstList,secondList);

    }
    private ListNode merge(ListNode list1,ListNode list2)
    {
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                ans.next=list1;
                list1=list1.next;
            }
            else {
                ans.next=list2;
                list2=list2.next;
            }
            ans=ans.next;

        }

        if (list1!=null)
        {
            ans.next=list1;
            list1=list1.next;
        }
        if (list2!=null)
        {
            ans.next=list2;
            list2=list2.next;
        }
       return dummy.next;
    }

    public static ListNode detectCycle(ListNode head) {
        boolean isCycle=false;
        ListNode slow=head;
        ListNode fast=head;
        ListNode p=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                p=slow;
                isCycle=true;
                break;
            }
        }
        ListNode q=head;
        if(isCycle) {
            return null;
        }
            while (p != q) {
                p = p.next;
                q = q.next;
            }
            return p;


    }

    public int firstUniqChar(String s) {
        int [] temp=new int[256];
        for(int i=0;i<s.length();i++)
        {
        temp[s.charAt(i)]++;
        }

        for(int i=0;i<s.length();i++)
        {
            if(temp[s.charAt(i)]==1)
            {
                return i;
            }
        }
        return -1;

    }
}
