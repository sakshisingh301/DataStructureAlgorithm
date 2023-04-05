package com.company.algoexpert;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {
    public static boolean generateDocument(String characters, String document) {
        Boolean isPossible=true;
        HashMap<Character,Integer> characterMap=new HashMap<>();
        HashMap<Character,Integer> documentMap=new HashMap<>();
        for(char c:characters.toCharArray())
        {

                if (!characterMap.containsKey(c)) {
                    characterMap.put(c, 1);
                } else {
                    characterMap.put(c, characterMap.get(c) + 1);
                }

        }
        for(char c:document.toCharArray())
        {

                if (!documentMap.containsKey(c)) {
                    documentMap.put(c, 1);
                } else {
                    documentMap.put(c, documentMap.get(c) + 1);
                }

        }
        for (Map.Entry<Character,Integer> entry : documentMap.entrySet())
        {
            char key=entry.getKey();
            int value1= entry.getValue();
            boolean status=characterMap.containsKey(key);
            if (!status) {
                isPossible = false;
                break;
            }
            else {
                int value2 = characterMap.get(key);
                if (value1 > value2) {
                    isPossible = false;
                }
            }

        }
        return isPossible;
    }

    public static void main(String[] args) {
        String Character="helloworldO";
        String document="hello wOrld";
        generateDocument(Character,document);
    }
}
