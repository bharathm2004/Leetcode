class Solution {
    public int minimumSum(int[] nums) {
        //brutee force
        // int minSum= Integer.MAX_VALUE;
        // for(int i=0;i<nums.length-2;i++)
        // {
        //     for(int j=i+1;j<nums.length-1;j++)
        //     {
        //         if(nums[i]<nums[j])
        //         {
        //             for(int k=j+1;k<nums.length;k++)
        //             {
        //                 if(nums[k] < nums[j])
        //                 {
        //                     int sum=nums[i]+nums[j]+nums[k];
        //                     minSum=Math.min(minSum,sum);
        //                 }
        //             }
        //         }
        //     }
        // }
        // return minSum==Integer.MAX_VALUE ? -1 : minSum;

        int sum = Integer.MAX_VALUE;
        int minSuff[]= new int[nums.length];
        minSuff[nums.length-1]= nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            minSuff[i]=Math.min(nums[i],minSuff[i+1]);
        }
        int prefix=nums[0];
        //for j index
        for(int j=1;j<nums.length-1;j++)
        {
            if(prefix< nums[j] && nums[j]> minSuff[j+1])
            {
                sum = Math.min(sum, prefix+nums[j]+minSuff[j+1]);
            }
            prefix = Math.min(prefix,nums[j]);
        }
        if(sum==Integer.MAX_VALUE)
        return -1;
        return sum;

    }
}