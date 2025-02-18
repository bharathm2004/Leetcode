class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
          int arr[]= new int[nums1.length];
          Map<Integer, Integer> map = new HashMap<>();
          for(int i=0;i<nums2.length;i++)
          {
            boolean flag=false;
            for(int j=i+1;j<nums2.length;j++)
            {
                if(nums2[j]>nums2[i])
                {
                    map.put(nums2[i],nums2[j]);
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                map.put(nums2[i],-1);
            }
          }
          for(int i=0;i<nums1.length;i++)
          {
              arr[i]=map.get(nums1[i]);
          }
          return arr;
    } 
}