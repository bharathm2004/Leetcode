class Solution {
    public int countPrimes(int n) {
        int count=0;
        if(n==1 || n==0)
        return count;
        boolean prime[]= new boolean[n];
        Arrays.fill(prime, true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i<prime.length;i++)
        {
            if(prime[i])
            {
                for(int j=i*2;j<prime.length;j+=i)
                {
                    prime[j]=false;
                }
            }
        }
        for(boolean i:prime)
        {
            if(i==true)
            count++;
        }
        return count;
    }
}