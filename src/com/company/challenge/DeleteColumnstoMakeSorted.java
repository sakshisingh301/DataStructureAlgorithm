package com.company.challenge;

public class DeleteColumnstoMakeSorted {

    public int minDeletionSize(String[] strs) {

        int delete=0;
        int n=strs.length;
        int m=strs[0].length();

        for(int i=0;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(strs[j].charAt(i)<strs[j-1].charAt(i))
                {
                    delete++;
                    break;
                }
            }
        }
        return delete;



    }

    public static void main(String[] args) {
       String[] strs = {"cba","daf","ghi"};


    }
}
