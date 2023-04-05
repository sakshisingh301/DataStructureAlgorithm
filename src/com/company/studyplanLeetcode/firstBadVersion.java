package com.company.studyplanLeetcode;

public class firstBadVersion {

//idea is once you find isBadVersion=true , go backward and check where it started

    public static boolean isBadVersion(int version)
    {
        if(version==1 || version==2 ||version==3)
            return false;
       else
           return true;
    }
    public static int firstBadVersion(int n) {
        int result=-1;
        int start=1;
        int end=n;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(isBadVersion(mid) && isBadVersion(mid-1) && mid>1)
            {
                end=mid-1;
            }
            else if(isBadVersion(mid) && !isBadVersion(mid-1) && mid>1 || isBadVersion(mid) && mid==1 )
            {
                result=mid;
                break;
            }
            else if(!isBadVersion(mid) && mid<n)
            {
                start=mid+1;
            }


        }
        return result;

    }

    public static void main(String[] args) {
        int n=5;
        firstBadVersion(n);

    }


}
