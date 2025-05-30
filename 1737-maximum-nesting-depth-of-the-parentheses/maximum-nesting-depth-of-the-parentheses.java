class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        for(char c : s.toCharArray())
        {
            if(c=='(')
            {
                count++;
                if(count > max)
                {
                    max=count;
                }
            }
            else if(c==')')
            {
                count--;
            }
        }
        return max;
    }
}