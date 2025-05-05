// question is about u have given 2*n board in which we have to place those domino and tromnio title to cover the board so that the result indicates how many possible ways to do that
class Solution {
    public int numTilings(int n) {
        int MOD = 1000000007;// result should be in 10^9+7
        if(n==1) 
        return 1; // only one tile (domino to cover 2*1 board)
        if(n==2)
        return 2; // 2 domino or 2 tromino title to cover the board
        long dp[]= new long[n+1];
        dp[0]=1; // empty board
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=(2*dp[i-1]+ dp[i-3])%MOD;
        }
        //2 * dp[i-1] means already we tiled the board using vertical and horizontal domino so we need 2 extra to cover the next i th board cell dp[i-3] is trimino
        return (int)dp[n];

    }
}