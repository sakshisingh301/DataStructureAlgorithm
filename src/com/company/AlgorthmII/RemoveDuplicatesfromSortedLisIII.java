//package com.company.AlgorthmII;
//
//
// class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//
//public class RemoveDuplicatesfromSortedLisII {
//
//    public static ListNode deleteDuplicates(ListNode head) {
//
//        ListNode curr=head;
//        ListNode prev=null;
//        while (curr!=null)
//        {
//            if(curr.val==curr.next.val)
//            {
//
//              while(curr.next!=null &&curr.val==curr.next.val)
//              {
//                  curr=curr.next;
//              }
//              if(prev!=null)
//              {
//                  prev.next=curr.next;
//              }
//              else
//              {
//                  head=curr.next;
//              }
//            }
//            else {
//                prev=curr;
//                curr = curr.next;
//            }
//        }
//        return head;
//
//    }
//
//
//    public static void main(String[] args) {
//
//    }
//}
