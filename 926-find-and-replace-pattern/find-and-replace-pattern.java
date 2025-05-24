class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String>list = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(solve(words[i],pattern))
            {
                list.add(words[i]);
            }
        }
        return list;
    }
    public static boolean solve(String s,String pattern)
    {
        if(s.length()!=pattern.length())
        {
            return false;
        }
        HashMap<Character , Character> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            Character c=pattern.charAt(i);
            if(map.containsKey(c))
            {
                if(map.get(c)!=s.charAt(i))
                {
                    return false;
                }
            }
            else 
            {
                if(map.containsValue(s.charAt(i)))
                {
                    return false;
                }
                map.put(c,s.charAt(i));
            }
        }
        return true;
    }
}