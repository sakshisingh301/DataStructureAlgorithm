package com.company.leetcode.dsaseries;

public class DetermineWhetherMatrixCanBeObtainedByRotation {

    public static boolean findRotation(int[][] mat, int[][] target) {
        if(mat==target)
            return true;

        return oneRotation(mat,target) ;


    }

    public static boolean oneRotation (int[][] mat, int[][] target) {

        int[][] result=new int[mat.length][mat[0].length];

        int count = 3;
        while (count > 0)
        {
            int k = mat[0].length - 1;
            int[][] result1=new int[mat.length][mat[0].length];

            for (int i = 0; i < mat.length; i++)
            {
                for (int j = 0; j < mat[0].length; j++)
                {
                    if(count==3) {
                        result[j][k] = mat[i][j];
                    }
                    else
                    {
                        result1[i][j]=result[j][k];

                    }
                }
                k--;
            }
            if(count==3 && result==target)
            {
                return true;
            }else if(result1==target){
                return true;
            }
            if(count!=3)
                result=result1;

        count--;

    }
        return false;

    }
//    public static boolean twoRotation (int[][] mat, int[][] target)
//    {
//        int k=mat[0].length-1;
//
//        for(int i=0;i< mat.length;i++)
//        {
//            for(int j=0;j<mat[0].length;j++)
//            {
//
//                mat[i][j]=target[k][j];
//
//            }
//            k--;
//        }
//        return mat==target;
//
//    }
//    public static boolean threeRotation (int[][] mat, int[][] target)
//    {
//        int k=0;
//
//        for(int i=0;i< mat.length;i++)
//        {
//            for(int j=0;j<mat[0].length;j++)
//            {
//              mat[i][j]=target[j][k];
//
//
//            }
//            k++;
//        }
//        return mat==target;
//
//    }


    public static void main(String[] args) {
       int [] [] mat = {{1,1},{0,1}};
       int [] [] target = {{1,1},{1,0}};
      System.out.println( findRotation(mat,target));
    }
}
