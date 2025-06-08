class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length()%2!=0)
        return false;
        int balancecount = 0;
        //left to right pass
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || locked.charAt(i)=='0' ) // treating unlocked 0 as '('
            {
                balancecount++;
            } 
            else
            {
                balancecount--;
            }
            if(balancecount < 0) // if tomany closing it goes in negative
            {
                return false;
            }
        }
        //right to left pass
        balancecount = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==')' || locked.charAt(i)=='0')
            {
                balancecount++;
            }
            else
            {
                balancecount--;
            }
            if(balancecount < 0)
            {
                return false;
            }
        }
        return true;
    }
}