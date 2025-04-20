class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
                int sind= s.indexOf(s.charAt(i));
                int eind=s.lastIndexOf(s.charAt(i));
                int pos = s.charAt(i)-'a';
                if(distance[pos]!= eind- sind-1)
                {
                    return false;
                }

            }
        }
        return true;
    }
}