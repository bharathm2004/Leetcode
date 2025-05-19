class Solution {
    public boolean isSameAfterReversals(int num) {
        int n1 = rev(num);
        int n2= rev(n1);
        if(num==n2)
        return true;
        return false;
    }
    public static int rev(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int rem= n%10;
            rev=rev*10 + rem;
            n=n/10;
        }
        return rev;
    }
}