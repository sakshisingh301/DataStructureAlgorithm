//package com.company.algorithmI;
//
//public class FirstBadVersion {
//    public int firstBadVersion(int n) {
//        int result=1;
//        int start=1;
//        int end=n;
//
//        while(start<=end)
//        {
//            int mid=start+(end-start)/2;
//            if(isBadVersion(mid) && !isBadVersion(mid-1) && mid>1)
//            {
//               result=mid;
//               break;
//            }
//            else if(isBadVersion(mid) && isBadVersion(mid-1) && mid>1  || isBadVersion(mid ) && mid==1)
//            {
//                end=mid-1;
//            }
//            else if(!isBadVersion(mid)  && mid<n )
//            {
//                start=mid+1;
//            }
//        }
//        return result;
//
//    }
//
//
//}
//
