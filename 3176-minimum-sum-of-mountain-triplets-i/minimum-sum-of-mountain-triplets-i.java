class Solution {
    public int minimumSum(int[] nums) {
        //int res=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if(nums[i]<nums[j] && nums[k]<nums[j])
                    {
                        int sum = nums[i]+nums[j]+nums[k];
                        max=Math.min(sum,max);
                        //System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                    }
                }
            }
        }
        if(max==Integer.MAX_VALUE)
        return -1;
        return max;
    }
}