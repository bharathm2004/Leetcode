class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len=s.length();
        String arr[]= new String[(len+k-1)/k];
        int ind=0;
        for(int i=0;i<s.length();i+=k)
        {
            if(i+k<=s.length())
            {
                arr[ind]=s.substring(i,i+k);
                ind++;
            }
            else{
                StringBuilder sb = new StringBuilder(s.substring(i));
                while(sb.length()<k)
                {
                    sb.append(fill);
                }
                arr[ind]=sb.toString();
            }
        }
        return arr;
    }
}