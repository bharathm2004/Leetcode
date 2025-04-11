class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++)
        {
            String s= Integer.toString(i);
            int mid= s.length()/2;
            if(s.length()%2 != 0) continue;
            int leftsum=0,rightsum=0;
            for(int j=0;j<mid;j++)
            {
                leftsum+=s.charAt(j)-'0';
                rightsum+=s.charAt(j+mid)-'0';
            }
            if(leftsum == rightsum)
            {
                count++;
            }
        }
        return count;
    }
}