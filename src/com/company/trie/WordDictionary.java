package com.company.trie;


class TrieNode
{

    TrieNode [] links;
    char c;
    boolean isEnd;

    public TrieNode()
    {
  links=new TrieNode[26];
  isEnd=false;
    }


}
public class WordDictionary {




    public WordDictionary() {


    }
     TrieNode root=new TrieNode();
    public void addWord(String word) {

        TrieNode node=root;
        for(int i=0;i<word.length();i++)
        {
            char currentChar=word.charAt(i);
            if(node.links[currentChar-'a']==null)
            {
                node.links[currentChar-'a']=new TrieNode();
                node=node.links[currentChar-'a'];
            }
            else {
                node=node.links[currentChar-'a'];
            }
            node.isEnd=true;

        }





    }

    public boolean search(String word) {
        TrieNode trieNode=root;
       return helper(word,trieNode,0);

    }

    private boolean helper(String word, TrieNode curr, int start) {
        if (start == word.length()) {
            if (curr.isEnd) {
                return true;
            } else {
                return false;
            }
        }
        char c = word.charAt(start);
        if (c == '.') {
            for (int i = 0; i < 26; i++) {
                if (curr.links[i] != null) {
                    if (helper(word,curr.links[i],start+1)) {
                        return true;
                    }
                }
            }
        } else {
            if (curr.links[c-'a'] == null) {
                return false;
            } else {
                return helper(word,curr.links[c-'a'],start+1);
            }
        }
        return false;


    }


}
