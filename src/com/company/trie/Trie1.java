package com.company.trie;
class Node
{
   Node[] links=new Node[26];
   boolean isEnd=false;

   public Node()
   {

   }
   boolean containsKey(char c)
   {
       if(links[c-'a']!=null)
       {
           return true;
       }
       return false;
   }
   void put(char c, Node node)
   {
       links[c-'a']=node;
   }
   Node referencedToNextNode(char c)
   {
       return links[c-'a'];
   }
   boolean setEnd()
   {
       isEnd=true;
       return isEnd;
   }


}

class Trie {

    private Node root;

    public Trie() {
        root=new Node();

    }

    public void insert(String word) {

        Node node=root;
        for(int i=0;i<word.length();i++)
        {
            char currentChar=word.charAt(i);
            if(node.containsKey(currentChar))
            {
               node.put(currentChar,new Node());
            }
            node=node.referencedToNextNode(currentChar);
        }
        node.setEnd();


    }



    public boolean search(String word) {

        Node node=root;

        for(int i=0;i<word.length();i++)
        {
            char currentChar=word.charAt(i);
            if(!node.containsKey(currentChar))
            {
                return false;
            }
            node=node.referencedToNextNode(currentChar);
        }
        if(node.isEnd)
        {
            return true;
        }
        return false;

    }

    public boolean startsWith(String prefix) {

        Node node=root;

        for(int i=0;i<prefix.length();i++)
        {
            char currentChar=prefix.charAt(i);
            if(!node.containsKey(currentChar))
            {
                return false;
            }
            node=node.referencedToNextNode(currentChar);
        }
        return true;

    }
}

