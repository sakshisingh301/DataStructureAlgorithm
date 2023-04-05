package com.company.AlgorthmII;

class Searcha2DMatrixII {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row=matrix.length;
        int column=matrix[0].length;
        int i=0;
        int j=column-1;
        while(i<row && j>=0)
        {
            if(matrix[i][j]==target)
            {
                return true;
            }
            else if(matrix[i][j]>target)
            {
                j--;
            }
            else if(matrix[i][j]<target)
            {
                i++;
            }
        }
   return false;


    }

    public static void main(String[] args) {
        int [] []  matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=5;
        System.out.println( searchMatrix(matrix,target));


    }
}
