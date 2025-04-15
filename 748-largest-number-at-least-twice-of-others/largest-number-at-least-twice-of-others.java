class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]>max)
            {
              max = nums[i];
              ind = i;
            }
        }
        for(int i : nums)
        {
            if(i!=max)
            {
                if(i * 2 > max)
                return -1;
            }
        }
        return ind;

    }
}