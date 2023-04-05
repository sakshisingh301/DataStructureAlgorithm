package com.company.leetcode.dsaseries;

public class RotateImage1 {
    public  static void rotate(int[][] matrix) {

        int R=matrix.length;
        int C=matrix[0].length;
        for(int i=0;i<R;i++)
        {
            for(int j=i;j<C;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        int i=0;
        int  j=C-1;
        for(int k=0;k<R;k++)
        {

                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;

        }



    }


    public static void main(String[] args) {
        int [][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
    }
}
