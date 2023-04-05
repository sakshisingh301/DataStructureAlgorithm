package com.company.studyplanLeetcode;

import java.util.HashSet;

public class isValidSudoku {


    public boolean isValidSudoku(char[][] board) {
        int N=9;

        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] col = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for(int i=0;i<N;i++)
        {
            rows[i]=new HashSet<Character>();
            col[i]=new HashSet<Character>();
            boxes[i]=new HashSet<Character>();
        }

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                char val=board[i][j];
                if(val=='.')
                {
                    continue;
                }
                if(rows[i].contains(val))
                    return  false;
                rows[i].add(val);
                if(col[j].contains(val))
                    return false;
                col[j].add(val);
                int index=i/3 *3+j/3;
                if(boxes[index].contains(val))
                    return false;
                boxes[index].add(val);


            }
        }
        return true;



    }
}
