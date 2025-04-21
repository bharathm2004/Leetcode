class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String ,Integer> map1 = new HashMap<>(); 
        HashMap<String ,Integer> map2 = new HashMap<>();
        int count=0;
        for(String s: words1)
        {
            map1.put(s,map1.getOrDefault(s,0)+1);
        } 
        for(String a: words2)
        {
            map2.put(a,map2.getOrDefault(a,0)+1);
        }
        for(String b : map1.keySet())
        {
            if(map1.get(b)==1 && map2.containsKey(b) && map2.get(b)==1)
            {
                count++;
            }
        } 
        return count;
    }
}