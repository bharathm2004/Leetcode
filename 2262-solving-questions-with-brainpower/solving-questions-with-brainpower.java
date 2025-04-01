class Solution {
    public long solve(int ind,int n,long dp[],int questions[][])
    {
        if(ind>=n) // base condition
        {
            return 0;
        }

        // if answer already computed for that index (memoziation step)
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }

        // add points of current index and move to next index based on brain power
        long take = questions[ind][0] + solve(ind+questions[ind][1]+1,n,dp,questions);
        // skip the current index and move to next (+1)
        long notTake = solve(ind+1,n,dp,questions);
        // store the result (max points gained by starting at the particular index)
        return dp[ind]= Math.max(take,notTake);

    }
    public long mostPoints(int[][] questions) {
        int n=questions.length; // Total number of questions(rows)
        long dp[]= new long[n+1]; // dp array to store result
        Arrays.fill(dp,-1);
        return solve(0,n,dp,questions);// start from zero index
    }
}