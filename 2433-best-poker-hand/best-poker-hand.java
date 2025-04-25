class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        
        for(int i=0;i<suits.length-1;i++)
        {
            if(suits[i]!=suits[i+1])
            {
                break;
            }
            if(i==suits.length-2)
            {
                return "Flush";
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<ranks.length;i++)
        {
            map.put(ranks[i],map.getOrDefault(ranks[i],0)+1);
        }
         boolean foundPair = false;
        for(int i : map.keySet())
        {
            if(map.get(i)>=3)
            {
                return "Three of a Kind";
            }
            else if(map.get(i)==2)
            {
                foundPair = true;
            }
        }
            if (foundPair) return "Pair";
        return "High Card";
    }
}