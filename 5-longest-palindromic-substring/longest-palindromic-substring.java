class Solution {
    public String longestPalindrome(String s) {
       int n=s.length();
       int start=0;
       int maxlen=0;
       for(int i=0;i<n;i++)
       {
        for(int j=i;j<n;j++)
        {
            if(check(s,i,j))
            {
                if(j-i+1 > maxlen)
                {
                    maxlen=j-i+1;
                    start=i;
                }
            }
        }
       }
       return s.substring(start,start+maxlen);
    }
       public boolean check(String s,int left,int right)
       {
           while(left < right)
           {
             if(s.charAt(left)!=s.charAt(right))
             {
                return false;
             }
             left++;
             right--;
           }
           return true;
       }
}