class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurance(nums, target);
        int last = lastOccurance(nums, target);
        return new int[] {first,last};
    }
    public static int firstOccurance(int arr[],int t)
    {
        int left=0;
        int right = arr.length-1;
        int res =-1;
        while(left<=right)
        {
            int mid= left+(right-left)/2;
            if(arr[mid]==t)
            {
                res=mid;
                right=mid-1; // search on left for any first occurance
            }
            else if(arr[mid] < t)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return res;
    }
    public static int lastOccurance(int arr[],int t)
    {
        int left=0, right=arr.length-1,res=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==t)
            {
                res=mid;
                left=mid+1; // serach for any element in right (last)
            }
            else if(arr[mid]< t)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return res;
    }
}