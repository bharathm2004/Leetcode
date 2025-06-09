class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open=0;
        //removing extra closing brackets (left to right pass)
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='(')
            {
                open++;
                sb.append(c);
            }
            else if(c==')')
            {
                if(open > 0)
                {
                open--;
                sb.append(c);
                }
            }
            else
            {
                sb.append(c); // include the character
            }
        }
        StringBuilder res = new StringBuilder();
        int openneed=0;
        for(int i=sb.length()-1; i>=0;i--)
        {
            char c = sb.charAt(i);
            if(c=='(' && openneed > 0 )
            {
                openneed--;
            }
            else if(c=='(')
            {
                continue;
            }
            else if(c==')')
            {
                openneed++;
            }
            res.append(c);
        }
        return res.reverse().toString();
    }
}