package com.company.leetcodeAlgoCuratedQuestion;






public class Solution  {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        int length= buf.length;
        if(length>n)
            return n;
        return length;


    }
}
