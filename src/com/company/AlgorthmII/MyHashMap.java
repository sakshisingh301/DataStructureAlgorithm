package com.company.AlgorthmII;

import java.util.ArrayList;
import java.util.List;
class Node
{
    int key;
    int val;
    Node next;

    public Node(int key,int val)
    {
        this.key=key;
        this.val=val;
    }
}
class MyHashMap {

Node [] nodes=new Node[1000000];

    public MyHashMap() {



    }

    public void put(int key, int value) {

        int index=getHash(key);
        Node prev=findElement(index,key);
        if(prev.next==null)
        {
         prev.next=new Node(key,value);
        }
        else
        {
            prev.next.val=value;
        }




    }

    private Node findElement(int index, int key) {
        if(nodes[index]==null)
        {
            return nodes[index]=new Node(-1,-1);
        }
        Node prev=nodes[index];
        while(prev.next!=null && prev.next.key!=key)
        {
            prev=prev.next;
        }
        return prev;


    }

    private int getHash(int key)
    {
        return key%nodes.length;
    }

    public int get(int key) {

        int index=getHash(key);
        Node prev=findElement(index,key);
        return prev.next==null ? -1 : prev.next.val;

    }

    public void remove(int key) {
        int index=getHash(key);
        Node prev=findElement(index,key);
        while(prev.next!=null)
        {
            prev.next=prev.next.next;
        }

    }
}
