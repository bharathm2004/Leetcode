class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count=0;
        for(int i=0;i<timeSeries.length-1;i++)
        {
            //check if the next attack comes in the current duration (overlapping)
            if(timeSeries[i+1] <= timeSeries[i]+duration-1)
            {
                //overlap occures to subtract the difference
                count+=timeSeries[i+1]-timeSeries[i];
            }
            //no overlap take the full duration
            else
            {
                count+=duration;
            }
        }
        //include the last attack
        count+=duration;
        return count;
    }
}