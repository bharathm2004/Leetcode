class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    if(nums==null||nums.length<3)
    return new ArrayList<>();
       Arrays.sort(nums);
       //set will not include duplicates
       HashSet<List<Integer>> result = new HashSet<>();
       for(int i=0;i<nums.length-2;i++){
        int left = i+1;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[i]+nums[left]+nums[right];
            if(sum==0){
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
            }
            //sum less than zero increase negative value by incrementing left
            else if(sum<0){
                left++;
            }
            //sum greater than 0 decrement right
            else{
                right--;
            }
        }
       }
       return new ArrayList<>(result);
    }
}