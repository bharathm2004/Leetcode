class Solution {
    public List<String> summaryRanges(int[] nums) {
       List<String> list = new ArrayList<>();
       if(nums.length==0)
       return list;
       int start=0;
       for(int i=1;i<=nums.length;i++)
       {
          if(i==nums.length || nums[i]!=nums[i-1]+1)
          {
            if(start==i-1)
            {
                list.add(Integer.toString(nums[start]));
            }
            else
            {
                list.add(Integer.toString(nums[start])+"->"+Integer.toString(nums[i-1]));
            }
            start=i;
          }
       }
       return list;
    }
}