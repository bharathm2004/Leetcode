class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        for(int i=1;i<=n;i++)
        {
            int digitsum = find(i);
            map.put(digitsum, map.getOrDefault(digitsum,0)+1);
            max=Math.max(max,map.get(digitsum));
        }
        int count=0;
        for(int i : map.keySet())
        {
            if(map.get(i)==max)
            {
                count++;
            }
        }
        return count;
    }
    public static int find(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
}