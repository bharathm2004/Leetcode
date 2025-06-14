class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean used[]= new boolean[nums.length];
        Arrays.sort(nums); // group duplicates together
        solve(res,temp,nums,used);
        return res;
    }
    public static void solve(List<List<Integer>> res, List<Integer> temp , int nums[],boolean used[])
    {
        if(nums.length==temp.size())
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            //skip if the element is already used
            if(used[i])
            {
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !used[i-1])
            {
                continue;
            }
            used[i]=true;
            temp.add(nums[i]);
            solve(res,temp,nums,used);
            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }
}