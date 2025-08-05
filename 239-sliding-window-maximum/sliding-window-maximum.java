class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //dq will store the incides of elements 
        List<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<nums.length;i++)
        {
            // if the first incides goes out of window remove it
            if(!dq.isEmpty() && dq.peekFirst()<=i-k)
            {
                dq.pollFirst();
            }

            //remove the elements smaller than the current element
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
            {
                dq.pollLast();
            }

            //add the current element index
            dq.addLast(i);

            // window is ready
            if(i>=k-1)
            {
                list.add(nums[dq.peekFirst()]);
            }
        }
        int arr[]= new int[list.size()];
        int ind=0;
        for(int i:list)
        {
            arr[ind++]=i;
        }
        return arr;
    }
}