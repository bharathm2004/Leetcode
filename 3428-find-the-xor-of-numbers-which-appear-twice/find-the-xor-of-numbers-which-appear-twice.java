class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int res=0;
        for(int i : map.keySet())
        {
            if(map.get(i)>=2)
            {
                res^=i;
            }
        }
        return res;
    }
}