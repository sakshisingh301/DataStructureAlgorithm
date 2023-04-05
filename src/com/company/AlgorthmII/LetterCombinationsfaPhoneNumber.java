package com.company.AlgorthmII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsfaPhoneNumber {

    public  List<String> letterCombinations(String digits) {

        List<String> ans=new ArrayList<>();
        if(digits.length()==0) return ans;

        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        findLetterCombinations(digits,ans,0,hm,new StringBuilder());
        return ans;


    }

    private  void findLetterCombinations(String digits, List<String> ans, int index, HashMap<Character, String> hm, StringBuilder temp) {

        if(index==digits.length())
        {
            ans.add(temp.toString());
            return;
        }

        String curr=hm.get(digits.charAt(index));

        for(int i=0;i<curr.length();i++)
        {
            temp.append(curr.charAt(i));
            findLetterCombinations(digits,ans,index+1,hm,temp);
            temp.deleteCharAt(temp.length()-1);
        }

    }


    public static void main(String[] args) {

        String digits = "23";

    }
}
