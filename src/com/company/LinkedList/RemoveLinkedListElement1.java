package com.company.LinkedList;

public class RemoveLinkedListElement1 {
    Node head;
    Node End;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }


    public Node removeElements(Node head, int val) {
        if(head==null)
            return null;

        Node curr=head;
        if(curr.next==null && curr.data!=val)
            return curr;
        if(curr.next==null && curr.data==val)
            return null;
        while (curr!=null)
        {
            if(head.data==val)
            {
                head=head.next;
            }
            else if(curr.next.data==val && curr.next.next==null)
            {
             curr.next=null;
            }
            else if(curr.next.data==val) {
               curr.next=curr.next.next;
               curr=curr.next;

            }
            curr=curr.next;
        }
       if(head!=null)
           return head;
        return null;

    }

    public boolean isPalindrome(Node head) {

        Node slow=head;
        Node fast=head;
        Node temp=null;
        Node first=head;
        Boolean isPalindrome=true;
        if(head.data==head.next.data && head.next.next==null )
        {
            return true;
        }
        Node curr=head;
        int length=0;
        while(curr!=null)
        {
            length++;
            curr=curr.next;
        }
        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
        Node second=null;
        if(length%2==0)
        {
          second = reverse(slow);
        }
        else {
            second=  reverse(slow.next);
        }
        while(first!=null && second!=null)
        {
            if (first.data!= second.data)
            {
                isPalindrome=false;
                break;
            }
            first=first.next;
            second=second.next;
        }


       return isPalindrome;

    }

    public  static Node mergeTwoLists(Node list1, Node list2) {
        Node dummy=new Node(0);
        Node result=dummy;

        while (list1!=null && list2!=null )
        {
            if(list1.data<= list2.data)
            {
                result.next=list1;
                list1=list1.next;

            }
            else {
                result.next=list2;
                list2=list2.next;
            }
            result=result.next;

        }
        if(list1!=null)
        {
            result.next=list1;

        }
        else if(list2!=null)
        {
            result.next=list2;
        }
        return dummy.next;


    }

    public static Node rotateRight(Node head, int k) {
     Node dummy=new Node(0);
     dummy.next=head;
     int count=0;
     int length=0;
     Node fast=dummy;
     Node slow=dummy;
     while(fast.next!=null)
     {
       length++;
       fast=fast.next;
     }
        int step=0;
     if(length<k)
     {
       step=k-length;
     }
     else
     {
       step=length-k;
     }

     while (slow!=null)
     {
         count++;
         if(count==step)
         {
             break;
         }
         slow=slow.next;
     }
   fast.next=dummy.next;
     dummy.next=slow.next;
     slow.next=null;

return dummy.next;

    }


    public Node reverse(Node head)
    {
        Node curr=head;
        Node nextCurr=head;
        Node prev=null;

        while(curr!=null)
        {
            nextCurr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextCurr;
        }
        head=prev;
        return head;
    }

    public Node oddEvenList(Node head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;

      Node oddStart=null;
      Node oddEnd=null;
      Node evenStart=null;
      Node evenEnd=null;
      Node curr=head;
      int count=0;
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
             else
             {
                 oddEnd.next=curr;
                 oddEnd=oddEnd.next;
             }
         }
         else {

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

    void print (Node head)
    {
        Node n = head;
        while (n != null)
        {
            System.out.println (n.data);
            n = n.next;
        }
    }
        public static void main(String[] args) {
            RemoveLinkedListElement1 obj1=new RemoveLinkedListElement1();
            int val=2;
            obj1.head = new Node(0);
           Node second1 = new Node(1);
            Node third1 = new Node(2);
//            Node fourth1 = new Node(4);
//            Node fifth1 = new Node(5);
//            RemoveLinkedListElement1 obj2=new RemoveLinkedListElement1();
//            obj2.head = new Node(1);
//            Node second2 = new Node(3);
//            Node third2= new Node(4);
//            Node fourth = new Node(4);
//            Node fifth=new Node(0);
//            Node sixth=new Node(1);
//            Node seventh=new Node(7);
           obj1.head.next=second1;
           second1.next = third1;
            third1.next = null;
//            fourth1.next=fifth1;
//            fifth1.next=null;
            rotateRight(obj1.head,4);

//            obj2.head.next=second2;
//            second2.next = third2;
//            third2.next = null;
//            fourth.next = fifth;
//            fifth.next=sixth;
//            sixth.next=null;
          //  seventh.next=null;
          //  obj.removeElements(obj.head,val);
         //   obj.oddEvenList(obj.head);
         //   System.out.println(obj1.isPalindrome(obj1.head));
           // obj.print(obj.head);
          //  mergeTwoLists(obj1.head,obj2.head);



        }
    }

