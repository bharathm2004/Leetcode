class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int open=0;
        for(char c : s.toCharArray())
        {
            if(c=='(')
            {
                if(open>0) // initally outermost open bracket is not counted
                sb.append(c);
                open++;
            }
            else if(c==')')
            {
                open--;
                if(open>0) // last closed bracket is not counted 
                sb.append(c);
            }
        }
        return sb.toString();
    }
}