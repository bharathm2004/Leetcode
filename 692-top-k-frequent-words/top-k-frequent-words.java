class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String i:words)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)-> {
            int diff = map.get(b)-map.get(a);
            if(diff==0)
            {
                return a.compareTo(b);
            }
            return diff;
        });
        pq.addAll(map.keySet());
        while(k--!=0)
        {
            res.add(pq.poll());
        }
        return res;
    }
}