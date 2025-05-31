class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        boolean prime[]= new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=2;i<prime.length;i++)
        {
            if(prime[i])
            {
                for(int j=i*2;j<prime.length;j=j+i)
                {
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<=n/2;i++)
        {
            int t= n-i;
            if(prime[i] && prime[t])
            {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(t);
                res.add(new ArrayList<>(list));
            }
        }
        return res;
    }
}