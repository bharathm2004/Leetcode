class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        int dp[]= new int[n];
        int prev[]= new int[n];
        Arrays.sort(nums);
        // dp array to store the length of largest divisible subset 
        Arrays.fill(dp,1); // set as 1 because every number is a subset of it
        Arrays.fill(prev,-1);
        int maxInd=0;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]%nums[j]==0 && dp[j]+1 > dp[i])
                {
                    dp[i]=dp[j]+1;
                    prev[i]=j;
                }
                if(dp[i]>dp[maxInd])
                {
                    maxInd=i;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        while(maxInd!=-1)
        {
            list.add(nums[maxInd]);
            maxInd = prev[maxInd];
        }
        return list;   
    }
}