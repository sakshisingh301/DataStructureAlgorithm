package com.company.studyplanLeetcode;

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicString {

//    public static boolean isIsomorphic(String s, String t) {
//        if(s.length()!=t.length()) {
//            return false;
//        }
//        Boolean isIsomorphic=true;
//        HashSet<Character> hashSet=new HashSet<>();
//
//        HashMap<Character,Character> map=new HashMap<>();
//        int i=0;
//        int j=0;
//        while(i<s.length() && j<t.length())
//        {
//            if(!map.containsKey(s.charAt(i))  &&!hashSet.contains(t.charAt(j)))
//            {
//                isIsomorphic=false;
//            }
//            else if(!map.containsKey(s.charAt(i))  ) {
//                map.put(s.charAt(i), t.charAt(j));
//            }
//            else if (map.containsKey(s.charAt(i)) && !map.get(s.charAt(i)).equals(t.charAt(j)))
//            {
//                isIsomorphic=false;;
//            }
//
//            i++;
//            j++;
//        }
//       return isIsomorphic;
//    }
//
public static boolean isIsomorphic(String s, String t) {
    if(s.length()!=t.length()) {
        return false;
    }
    Boolean isIsomorphic=true;
    HashSet<Character> hashSet=new HashSet<>();

    HashMap<Character,Character> map=new HashMap<>();
    int i=0;
    int j=0;
    while(i<s.length() && j<t.length())
    {

      if(!map.containsKey(s.charAt(i)) && !hashSet.contains(t.charAt(j))) {
            hashSet.add(t.charAt(j));
            map.put(s.charAt(i), t.charAt(j));
        }
        else if(!map.containsKey(s.charAt(i))  &&hashSet.contains(t.charAt(j)))
        {
            isIsomorphic=false;
            break;
        }
        else if (map.containsKey(s.charAt(i)) && !map.get(s.charAt(i)).equals(t.charAt(j)))
        {
            isIsomorphic=false;
            break;
        }

        i++;
        j++;
    }
    return isIsomorphic;
}


    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        isIsomorphic(s,t);

    }
}
