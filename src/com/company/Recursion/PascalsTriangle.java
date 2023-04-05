package com.company.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {

    List<List<Integer>> result=new ArrayList<>();

    public List<List<Integer>> generate(int numRows) {

        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        result.add(Collections.singletonList(1));
        if(numRows==1)
        {
            return result;
        }
        generatePascal(numRows,ans);
        return null;
        


    }

    private void generatePascal(int numRows, List<Integer> ans) {
    }

    public static void main(String[] args) {

    }
}
