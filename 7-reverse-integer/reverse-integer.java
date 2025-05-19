class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0)
        {
            int rem=x%10;
            int newRev=rev*10+rem;
            if((newRev-rem)/10 != rev)
            {
                return 0;
            }
            rev = newRev;
            x=x/10;
        }
        return rev;
    }
}