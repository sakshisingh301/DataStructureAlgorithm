package com.company.Recursion;

public class KthSymbolGrammer {

    /*go step by step
    * hypothesis - kthGrammar(n,k) , now make your input smaller
    * kthGrammar(n-1,k)
    * why cant we make k smaller
    * 0
    * 0 1
    * 0 1 1 0
    * 0 1
    *
    *
    * */

    public  static int kthGrammar(int n, int k) {

        if(n==1 && k==1)
            return 0;
        int mid =(int)Math.pow(2, n-1)/2;

        if(k<=mid)
        {
            return kthGrammar(n-1,k);
        }
        else
        {
            return kthGrammar(n-1,k-mid)^1;
        }

    }

    public static void main(String[] args) {
        int n = 2;
        int k= 2;
        System.out.println(kthGrammar(n,k));


    }
}
