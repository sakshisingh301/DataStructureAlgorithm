package com.company.studyplanLeetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public  static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result=new ArrayList<>();
        int row=matrix.length;
        int column=matrix[0].length;

        int lastRow=row-1;
        int lastColumn= column-1;
        int k=0;
        int l=0;
        while(k<=lastRow && l<=lastColumn)
        {
            for(int i=0;i<=lastColumn;i++)
            {
                result.add(matrix[k][i]);
            }
            k++;
            for(int i=k;i<=lastRow;i++)
            {
                result.add(matrix[i][lastColumn]);
            }
            lastColumn--;
            if(k<=lastRow) {
                for (int i = lastColumn; i >= l; i--) {
                    result.add(matrix[lastRow][i]);

                }
            }
            lastRow--;
            for(int i=lastRow;i>=k;i--)
            {
                result.add(matrix[i][l]);
            }
            l++;
        }
        return result;

    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(matrix);
    }
}
