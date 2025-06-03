class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int dp[][]= new int[str1.length()+1][str2.length()+1];
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
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]= 1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        int i = str1.length();
        int j = str2.length();

        while(i > 0 && j>0)
        {
            if(str1.charAt(i-1)==str2.charAt(j-1))
            {
                ans.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j] > dp[i][j-1])
            {
                ans.append(str1.charAt(i-1)); // to find normal lcs else if append not needed
                i--;
            }
            else
            {
                ans.append(str2.charAt(j-1));
                j--;
            }
        }
        //to add remaining 
        while (i >0)
        {
            ans.append(str1.charAt(i-1));
            i--;
        }
        while ( j> 0)
        {
            ans.append(str2.charAt(j-1));
            j--;
        }
        return ans.reverse().toString();
    }
}