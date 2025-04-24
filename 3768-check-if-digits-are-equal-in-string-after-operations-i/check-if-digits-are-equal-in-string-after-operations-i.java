class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>=2)
        {
            StringBuilder temp = new StringBuilder();
            for(int i=0;i<s.length()-1;i++)
            {
                int sum = (s.charAt(i)-'0' + s.charAt(i+1)-'0');
                temp.append(sum % 10);
            }
            s=temp.toString();
            if(temp.length()==2 && temp.charAt(0)==temp.charAt(1))
            {
                return true;
            }
        }
        return false;
    }
}