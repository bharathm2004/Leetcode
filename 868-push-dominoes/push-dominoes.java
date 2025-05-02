class Solution {
    public String pushDominoes(String dominoes) {
        int n=dominoes.length();
        int forces[]= new int[n];
        int force=0;
        //loop from left to right to calculate positive force(right force)
        for(int i=0;i<dominoes.length();i++)
        {
            char c = dominoes.charAt(i);
            if(c=='R')
            {
                //initially the force applied is full
                force=n;
            }
            else if(c=='L')
            {
                force=0;
            }
            else
            {
                //if . means the strength of right force is reduced by 1
                force=Math.max(force-1,0);
            }
            forces[i]+=force;
        }
        force=0;
        //loopm from right to left to calculate negative force(left force)
        for(int i=n-1;i>=0;i--)
        {
            char c = dominoes.charAt(i);
            if(c=='L')
            {
                force=n;
            }
            else if(c=='R')
            {
                force=0;
            }
            else
            {
                force = Math.max(force-1,0);
            }
            forces[i]-=force;
        }
        StringBuilder sb = new StringBuilder();
        for(int f:forces)
        {
            if(f>0)
            {
                sb.append('R');
            }
            else if(f<0)
            {
                sb.append('L');
            }
            else
            {
                sb.append('.');
            }
        }
        return sb.toString();
    }
}