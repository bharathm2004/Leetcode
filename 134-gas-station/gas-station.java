class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int t_gas=0,t_cost=0,c_cost=0,start=0;
        for(int i=0;i<n;i++)
        {
            t_gas+=gas[i];
            t_cost+=cost[i];
            c_cost+=gas[i]-cost[i];
            if(c_cost<0)
            {
                start=i+1;
                c_cost=0;
            }
        }
        if(t_gas<t_cost)
        return -1;
        return start;
    }
}