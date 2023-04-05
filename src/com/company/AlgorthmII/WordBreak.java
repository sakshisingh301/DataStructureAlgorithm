package com.company.AlgorthmII;

import java.util.*;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {

    HashSet<String> dictionary=new HashSet<>(wordDict);
    boolean [] visited=new boolean[s.length()];
    Queue<Integer> queue=new LinkedList<>();
    queue.add(0);
    while (!queue.isEmpty())
    {
        int start= queue.remove();
        if(visited[start])
        {
            continue;
        }
        for(int end=start+1;end<=s.length();end++)
        {
            String word=s.substring(start,end);
            if(dictionary.contains(word))
            {
                queue.add(end);
                if(end==s.length())
                {
                    return true;
                }
            }
        }
        visited[start]=true;

    }
    return false;


            }






    public static void main(String[] args) {
      String  s = "aaaaaaa";

      List<String> wordDict = new ArrayList<>();
      wordDict.add("aaa");
      wordDict.add("aaaa");



      wordBreak(s,wordDict);

    }
}
