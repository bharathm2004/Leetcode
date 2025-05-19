class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums)
        {
            set.add(i);
            set.add(rev(i));
        }
        return set.size();
    }
    public static int rev(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int rem= n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}