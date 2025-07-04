class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        if(n==0 || m==0)
        {
            return;
        }
        // marking all O connected to boarded as T
        for(int i=0;i<n;i++)
        {
            dfs(board,i,0);// first col
            dfs(board,i,m-1);// last col
        }
        for(int i=0;i<m;i++)
        {
            dfs(board,0,i); // first row
            dfs(board,n-1,i); // last row 
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                // the cell is not connected to any boarder and surrouned by X
                if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
                else if(board[i][j]=='T')
                {
                    board[i][j]='O';
                }
            }
        }
    }
    public void dfs(char board[][], int i,int j)
    {
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!='O')
        {
            return;
        }
        board[i][j]='T'; // tempoary mark
        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);
    }
}