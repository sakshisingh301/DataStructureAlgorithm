package com.company.Graph;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean [] [] visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                visited[i][j]=false;
            }
        }

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                   boolean status= dfs(board,word,new StringBuilder(),i,j,visited,0);
                   if(status)
                   {
                       return true;
                   }
                }
            }
        }
        return false;

    }

    private boolean dfs(char[][] board, String word, StringBuilder temp,int row,int column,boolean [] [] visited,int index) {
        if(index==word.length())
        {
          return true;
        }

        if(row<0 || row>=board.length || column<0 || column>=board[0].length || visited[row][column] || word.charAt(index)!=board[row][column] )
        {
            return false;
        }
        visited[row][column]=true;
     boolean up=dfs(board,word,temp,row-1,column,visited,index+1);
     boolean down =dfs(board,word,temp,row+1,column,visited,index+1);
     boolean left=dfs(board,word,temp,row,column-1,visited,index+1);
     boolean right=dfs(board,word,temp,row,column+1,visited,index+1);
     visited[row][column]=false;

   return up||down||left||right;





    }

    public static void main(String[] args) {

    }
}
