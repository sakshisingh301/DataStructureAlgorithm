package com.company.leetcode.dsaseries;

import java.util.HashMap;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        boolean canConstruct=false;
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
      for(int i=0;i<magazine.length();i++)
      {
          if(map.containsKey(magazine.charAt(i)))
          {
              map.put(magazine.charAt(i),map.get(magazine.charAt(i)) - 1);
              if(map.get(magazine.charAt(i))==0)
              {
                  map.remove(magazine.charAt(i));
              }
          }
      }
      if(map.isEmpty())
      {
          canConstruct=true;
      }


    return canConstruct;

    }

    public static void main(String[] args) {
      String  ransomNote = "aab";
      String magazine = "baa";
      canConstruct(ransomNote,magazine);

    }
}
