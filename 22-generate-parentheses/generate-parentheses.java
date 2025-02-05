class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String s="";
        find(ans,s,0,0,n);
        return ans;
    }
    public void find(List<String> ans, String s, int open, int close, int n)
    {
        if(s.length()==n*2)
        {
            ans.add(s);
            return;
        }
        if(open<n)
        {
            find(ans,s+'(',open+1,close,n);
        }
        if(close<open)
        {
            find(ans,s+')',open,close+1,n);
        }
    }
}