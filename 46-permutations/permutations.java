class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        backtrack(res,temp,nums);
        return res;
    }
    public static void backtrack(List<List<Integer>> res , ArrayList<Integer> temp, int nums[] )
    {
        if(nums.length==temp.size())
        {
            res.add(new ArrayList(temp));
        }
        for(int i=0;i<nums.length;i++)
        {
            if(temp.contains(nums[i]))
            {
                continue;
            }
            temp.add(nums[i]);
            backtrack(res,temp,nums);
            temp.remove(temp.size()-1);
        }

    }
}