class Solution {
    public long minCost(int[] basket1, int[] basket2) {

        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int fruit : basket1)
        {
            map.put(fruit, map.getOrDefault(fruit,0)+1);
            min=Integer.min(min,fruit);
        }
        for(int fruit : basket2)
        {
            map.put(fruit, map.getOrDefault(fruit,0)-1);
            min=Integer.min(min,fruit);
        }

        List<Integer> doSwap = new ArrayList<>();

        for(int fruit:map.keySet())
        {
            int dif = map.get(fruit);
            if(dif%2!=0)
            {
                return -1;
            }
            for(int i=0;i<Math.abs(dif)/2;i++)
            {
                doSwap.add(fruit);
            }
        }
        Collections.sort(doSwap);
        long mincost=0;
        for(int i=0;i<doSwap.size()/2;i++)
        {
            mincost+=Math.min(doSwap.get(i),min*2);
        }
        return mincost;
    }
}