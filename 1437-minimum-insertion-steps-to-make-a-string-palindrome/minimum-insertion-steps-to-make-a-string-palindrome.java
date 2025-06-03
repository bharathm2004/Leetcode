class Solution {
    public int minInsertions(String s) {
        StringBuilder sb = new StringBuilder(s);
        String t = sb.reverse().toString();
        int n = lps(s,t);
        return s.length()- n;
    }
    public static int lps(String s, String t)
    {
        //longest palindromic subsequence
        int dp[][]= new int[s.length()+1][t.length()+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}