class Solution {
    public static int solve(int ind,int nums[],int dp[],int n)
    {
        if(ind>=n)
        {
            return 0;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        int take = nums[ind]+ solve(ind+2,nums,dp,n);

        int notTake = solve(ind+1,nums,dp,n);

        return dp[ind]= Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        int n= nums.length;
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,nums,dp,n);
    }
}