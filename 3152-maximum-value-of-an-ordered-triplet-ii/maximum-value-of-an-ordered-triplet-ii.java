class Solution {
    public long maximumTripletValue(int[] nums) {
        if(nums.length<3)
        return 0;
        int prefixMax[]= new int[nums.length];
        int suffixMax[]= new int[nums.length];
        prefixMax[0]=nums[0];
        suffixMax[nums.length-1]= nums[nums.length-1];
        for(int i=1;i<nums.length;i++)
        {
            prefixMax[i]=Math.max(prefixMax[i-1],nums[i]);
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            suffixMax[i]=Math.max(nums[i],suffixMax[i+1]);
        }
        long sum=0;
        for(int i=1;i<nums.length-1;i++)
        {
            int leftMax = prefixMax[i-1];
            int rightMax=suffixMax[i+1];
            sum=Math.max((long)(leftMax-nums[i])*rightMax,sum);
        }
        return sum;
    }
}