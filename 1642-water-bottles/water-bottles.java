class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        int n=numBottles;
        while(n>=numExchange)
        {
            int q=n/numExchange;
            res+=q;
            n=q+(n%numExchange);
        }
        return res;
    }
}