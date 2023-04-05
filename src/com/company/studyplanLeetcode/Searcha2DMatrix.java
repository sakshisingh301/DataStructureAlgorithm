package com.company.studyplanLeetcode;

public class Searcha2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean searchFound=false;
        int i=0;
        int j=matrix[0].length-1;

        while(i<matrix.length && j>=0)
        {
            if(matrix[i][j]==target)
            {
              searchFound=true;
            }
            else if(matrix[i][j]>target)
            {
                j--;

            }
            else {
                i++;
            }
        }
        return searchFound;

    }
    public static void main(String[] args) {
        int [] [] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        searchMatrix(matrix,target);
    }
}
