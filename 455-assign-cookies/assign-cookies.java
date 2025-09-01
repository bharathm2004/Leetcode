class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int a=0,b=0;
        while(a<g.length && b<s.length)
        {
            if(s[b]>=g[a])
            {
                count++;
                a++;
                b++;
            }
            else
            {
                b++;
            }
        }
        return count;
    }
}