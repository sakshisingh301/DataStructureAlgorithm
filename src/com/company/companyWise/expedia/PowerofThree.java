package com.company.companyWise.expedia;

public class PowerofThree {

    public boolean isPowerOfThree(int n) {

        if( n<1)
            return false;
        if(n%3==0)
        {
            while(n!=0)
            {
                if(n%3==0)
                    return true;
                n=n/3;
            }
        }
        return false;

    }
    public static void main(String[] args) {

    }
}
