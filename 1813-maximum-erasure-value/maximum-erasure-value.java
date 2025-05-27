class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        // int max=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     int sum=0;
        //     HashSet<Integer> set = new HashSet<>();
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         if(set.contains(nums[j]))
        //         {
        //             break;
        //         }
        //         set.add(nums[j]);
        //         sum+=nums[j];
        //     }
        //     max = Math.max(max,sum);
        // }
        // return max;

        int left = 0, max=0;
        HashSet<Integer> set = new HashSet<>();
        int sum=0;
        for(int right = 0;right < nums.length; right++)
        {
            while(set.contains(nums[right]))
            {
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            set.add(nums[right]);
            sum+=nums[right];
            max = Math.max(sum,max);
        }
        return max;
    }
}