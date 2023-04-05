package com.company.studyplanLeetcode;

import java.util.HashMap;

public class LongestPalindromebyConcatenatingTwoLetterWords {

//    public static int longestPalindrome(String[] words) {
//       StringBuilder stringBuilder=new StringBuilder();
//       int length=0;
//        int maxLength=0;
//        int pair=0;
//        boolean status=false;
//        boolean loop=false;
//        HashMap<String,Integer> map=new HashMap<>();
//        for(int i=0;i<words.length;i++)
//        {
//           char c1 = words[i].charAt(1);
//           char c2=words[i].charAt(0);
//           String result= new StringBuilder().append(c1).append(c2).toString();
//            if(!map.containsKey(words[i]) && !map.containsKey(result) && words[i].charAt(0)!=words[i].charAt(1))
//            {
//                map.put(words[i],1);
//                status=true;
//            }
//            else if(   map.containsKey(result) && !map.containsKey(words[i]) ) {
//                map.remove(result);
//                pair=pair+2;
//                length=pair*2;
//                if(length>maxLength)
//                {
//                    maxLength=length;
//                }
//
//            }
//            else if(words[i].charAt(0)==words[i].charAt(1) && status)
//            {
//                pair++;
//                length=pair*2;
//                if(length>maxLength)
//                {
//                    maxLength=length;
//                }
//
//            }
//            else
//            {
//                if(!map.containsKey(words[i])) {
//                    loop = true;
//                    return 2;
//                }
//            }
//
//        }
//
//
//        return maxLength;
//
//
//    }
public static int longestPalindrome(String[] words) {
    HashMap<String, Integer> map = new HashMap<>();
    int max = 0;
    for (int i = 0; i < words.length; i++) {
        String rev = words[i].charAt(1) + "" + words[i].charAt(0);
        if (map.containsKey(rev)) {
            max += 4;
            map.put(rev, map.get(rev) - 1); // decrease its count as we won't be taking it again
            if (map.get(rev) == 0) map.remove(rev);
            continue; // as we also won't be taking current string again
        }
        map.put(words[i], map.getOrDefault(words[i], 0) + 1);
    }
    for (String k : map.keySet()) {
        if (map.get(k) == 1 && (k.charAt(1) + "" + k.charAt(0)).equals(k)) {
            max += 2;
            break;
        }
    }
    return max;



}
    public static void main(String[] args) {
        String[] s={"dd","aa","bb","dd","aa","dd","bb","dd","aa","cc","bb","cc","dd","cc"};
        longestPalindrome(s);
    }
}
