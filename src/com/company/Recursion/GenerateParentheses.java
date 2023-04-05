package com.company.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate(n,ans,new StringBuilder(),0,0);
        return ans;

    }

    private void generate(int n, List<String> ans, StringBuilder temp, int openBraces, int closedBraces) {

        if(openBraces==n && closedBraces==n && temp.length()==2*n)
        {
            ans.add(temp.toString());
            return;
        }

        if(openBraces<n)
        {
            temp.append("(");
            generate(n,ans,temp,openBraces+1,closedBraces);
            temp.deleteCharAt(temp.length()-1);
        }
        if(closedBraces<openBraces)
        {
            temp.append(")");
            generate(n,ans,temp,openBraces,closedBraces+1);
            temp.deleteCharAt(temp.length()-1);
        }


    }


    public static void main(String[] args) {
        int n=3;

    }

}
