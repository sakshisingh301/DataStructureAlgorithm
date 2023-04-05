package com.company.studyplanLeetcode;

import java.util.Arrays;
//idea is sort it by attack in increasing order and if the value of attack is repeating sort it in increasing order by defend
// ex-{1,2} {1,1} {2,2} {2,1}
//start fromm the bottom

public class TheNumberofWeakCharactersintheGame2 {

    public static int numberOfWeakCharacters(int[][] properties) {
        int weak=0;
        int row=properties.length;
       int maxDefence=Integer.MIN_VALUE;;
        Arrays.sort(properties,(a,b)-> b[0]==a[0] ?b[1]-a[1]: a[0]-b[0]);
       for (int i=row-1;i>=0;i--)
       {
       if(properties[i][1]<maxDefence)
       {
           weak++;
       }
       else
       {
           maxDefence=properties[i][1];
       }
       }


        return weak;

    }

    public static void main(String[] args) {
        int [] [] properties={{1,1},{2,1},{2,2},{1,2}};
        numberOfWeakCharacters(properties);
    }
}
