class Solution {
    public String largestGoodInteger(String num) {
        String s[]={"999","888","777","666","555","444","333","222","111","000"};
        for(String i:s)
        {
            if(num.contains(i))
            return i;
        }
        return "";
    }
}