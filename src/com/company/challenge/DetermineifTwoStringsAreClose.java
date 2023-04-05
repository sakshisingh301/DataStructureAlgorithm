package com.company.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DetermineifTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
            return false;

        HashMap<Character,Integer> wordOneMap=new HashMap<>();
        HashMap<Character,Integer> wordTwoMap=new HashMap<>();


        for(int i=0;i<word1.length();i++)
        {
            wordOneMap.put(word1.charAt(i), wordOneMap.getOrDefault(word1.charAt(i), 0) + 1);
        }

        for(int i=0;i<word2.length();i++)
        {
            wordTwoMap.put(word2.charAt(i),wordTwoMap.getOrDefault(word2.charAt(i),0)+1);
        }
        if(!wordOneMap.keySet().equals(wordTwoMap.keySet()))
            return false;

        List<Integer> list1=new ArrayList<>();
        for(int x:wordOneMap.values())
        {
            list1.add(x);

        }
        List<Integer> list2=new ArrayList<>();
        for(int x:wordTwoMap.values())
        {
            list2.add(x);

        }

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);

    }

    public static void main(String[] args) {
        String word1 = "cabbba";
        String word2 = "abbccc";
    }
}
