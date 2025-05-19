class Solution {
    public int myAtoi(String s) {
        //to remove white space 
        s=s.trim();

        int sign = 1; // Assume it is initally postive sign
        int i=0;
        long res=0;

        //base condition 
        if(s.length()==0)
        return 0;

        //sign check
        if(s.charAt(0)=='-')
        {
            sign=-1;
            i++;
        }
        else if(s.charAt(0)=='+')
        {
            i++;
        }

        while(i<s.length())
        {
            char c=s.charAt(i);
            //non numeric character
            if(c < '0' || c>'9')
            {
                break;
            }

            res = res * 10 + (c - '0'); 

            if(sign * res > Integer.MAX_VALUE) 
            return Integer.MAX_VALUE;

            if(sign * res < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

            i++;
        }
        return (int) (sign * res);

    }
}