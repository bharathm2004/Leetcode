class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left=0, maxlen=0;
        for(int right=0;right<fruits.length;right++)
        {
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            if(map.size()>2)
            {
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0)
                {
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}