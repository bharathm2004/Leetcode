class Solution {
    public int sum=0;
    public void find(int ind,int nums[], List<Integer> list)
    {
        if(ind== nums.length)
        {
            int xor=0;
            for(int i:list)
            {
                xor^=i;
            }
            sum+=xor;
            return;
        }
        list.add(nums[ind]);
        find(ind+1,nums,list);
        list.remove(list.size()-1);
        find(ind+1,nums,list);
    }
    public int subsetXORSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        find(0,nums,list);
        return sum;
    }
}