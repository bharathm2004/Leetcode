class Solution {
    public int characterReplacement(String s, int k) {
        int maxcount=0;
        int maxlen =0;
        int left=0;
        int arr[]= new int[26]; 
        for(int right=0;right<s.length();right++)
        {
            arr[s.charAt(right)-'A']++;
            maxcount=Math.max(arr[s.charAt(right)-'A'],maxcount);
            while((right-left+1) - maxcount > k)
            {
                arr[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);

        }
        return maxlen;
    }
}