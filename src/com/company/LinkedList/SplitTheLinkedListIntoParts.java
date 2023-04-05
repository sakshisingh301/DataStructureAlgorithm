package com.company.LinkedList;

import java.util.ArrayList;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class SplitTheLinkedListIntoParts {

    public static ListNode[] splitListToParts(ListNode head, int k) {
     ListNode [] res=new ListNode[k];
     ListNode curr=head;
     int length=0;
     while (curr!=null)
     {
         length++;
         curr=curr.next;
     }
     int i=0;
     int part=length/k;
     int remaining=length%k;
     int temp_equal=part;
     if(remaining>0) temp_equal=temp_equal+1;remaining--;
     while(curr!=null)
     {
         temp_equal--;
         if(temp_equal==0)
         {
             res[i++]=head;
             head=curr.next;


         }
         else
         {
             curr=curr.next;
         }
     }







return null;


    }

    public static void main(String[] args) {
        SplitTheLinkedListIntoParts obj=new SplitTheLinkedListIntoParts();
        //1 2 3 4 5 6 7 8 9 10
        //k=3

    }
}
