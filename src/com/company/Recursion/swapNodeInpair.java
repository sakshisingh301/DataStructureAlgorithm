package com.company.Recursion;

import com.company.LinkedList.DeleteNode;

public class swapNodeInpair {

    static class ListNode {
        int val;
       ListNode next;

        ListNode(int val) {
            this.val=val;
            next=null;

        }
    }

    public ListNode swapPairs(ListNode head) {

        if(head==null)
            return null;
        ListNode curr=head;
        swap(curr,curr.next);


        return head;

    }

    private void swap(ListNode curr, ListNode currNext) {
        if(curr==null || currNext==null) {
            return;
        }

        int temp=curr.val;
       curr.val=currNext.val;
       currNext.val=temp;
       swap(curr.next.next, currNext.next.next);


    }

    public static void main(String[] args) {

    }
}
