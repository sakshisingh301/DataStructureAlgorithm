package com.company.Recursion;

import java.util.ArrayList;

public class powerSet {

    public void solve(String ip,String op)
    {
        ArrayList<String> arrayList=new ArrayList<>();
       if(ip.length()==0)
       {
         arrayList.add(op);
         return;
       }
       String op1=op;
       String op2=op;
       op2=op2+ip.charAt(0);
       ip=ip.substring(1);
       solve(ip,op1);
       solve(ip,op2);
    }

    public static void main(String[] args) {
        String ip="ab";

    }
}
