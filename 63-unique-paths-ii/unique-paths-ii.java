class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int dp[][] = new int[n][m];

        //base condition 
        if(obstacleGrid[0][0]==1)
        return 0;
        //there is only one way to reach the first cell
        dp[0][0]=1;

        //first col
        for(int i=1;i<n;i++)
        {
            if(obstacleGrid[i][0]==1)
            {
                dp[i][0]=0;
            }
            // if there is obstacle in first row and col then next cell cannot be reached
            else 
            dp[i][0]=dp[i-1][0];
        }
        for(int j=1;j<m;j++)
        {
            if(obstacleGrid[0][j]==1)
            {
                dp[0][j]=0;
            }
            else
            {
                dp[0][j]=dp[0][j-1];
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(obstacleGrid[i][j]==1)
                {
                    dp[i][j]=0;
                }
                else
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
    }
}