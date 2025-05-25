class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
        return "";
        String prefix = strs[0]; // Assuming the first word is prefex
        int plen = strs[0].length(); 

        for(int i=1;i<strs.length;i++)
        {
            String s = strs[i];
            while(plen > s.length() || !prefix.equals(s.substring(0,plen)))
            {
                plen--;
                if(plen==0)
                {
                    return "";
                }
                prefix = prefix.substring(0,plen);
            }
        } 
        return prefix;
    }
}