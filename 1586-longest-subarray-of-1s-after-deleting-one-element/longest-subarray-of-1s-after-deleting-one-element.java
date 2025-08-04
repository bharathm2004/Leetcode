class Solution {
    public int longestSubarray(int[] nums) {
        int left=0, max=0;
        int count=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
            {
                count++;
            }
            while(count>1)
            {
                if(nums[left]==0)
                {
                count--;
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max-1;
    }
}