class Solution {
    public int[][] merge(int[][] intervals) {

        //base condition
        if(intervals.length<=1)
        return intervals;

        List<int[]> merged = new ArrayList<>();

        //compare based on the start time 
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0])); //if end time means a[1],b[1]

        for(int interval[]:intervals )
        {
            if(merged.isEmpty() || merged.get(merged.size()-1)[1] < interval[0])
            {
                merged.add(interval);
            }
            else
            {
                merged.get(merged.size()-1)[1] = Math.max(interval[1], merged.get(merged.size()-1)[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}