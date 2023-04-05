package com.company.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {

    public List<String> letterCombinations(String digits) {

        List<String> ans=new ArrayList<>();
        HashMap<Character,String> hm=new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        findLetterCombination(digits,0,new StringBuilder(),hm,ans);
        return ans;

    }

    private void findLetterCombination(String digits, int index, StringBuilder temp, HashMap<Character, String> hm, List<String> ans) {
        if(temp.length()==digits.length())
        {
            ans.add(temp.toString());
            return;

        }
        String curr=hm.get(digits.charAt(index));
                for(int i=0;i<curr.length();i++)
                {
                    temp.append(curr.charAt(i));
                    findLetterCombination(digits,index+1,temp,hm,ans);
                    temp.deleteCharAt(temp.length()-1);
                }


    }


    public static void main(String[] args) {

    }
}
