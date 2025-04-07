class Solution {
    public boolean solve(int ind,int nums[],int target,int dp[][])
    {
        if(target==0)
        return true;
        if(ind==0)
        return nums[0]==target;
        if(dp[ind][target]!=-1)
        {
            return dp[ind][target]==1;
        }
        boolean notTake = solve(ind - 1, nums, target, dp);
        boolean take = false;
        if (nums[ind] <= target) {
            take = solve(ind - 1, nums, target - nums[ind], dp);
        }
        dp[ind][target] = (take || notTake) ? 1 : 0;
        return take || notTake;
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int num:nums)
        {
            sum+=num;
        }
        if(sum%2!=0)
        {
            return false;
        }
        int target=sum/2;
        int dp[][]= new int[n][target+1];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(n-1,nums,target,dp);
    }
}