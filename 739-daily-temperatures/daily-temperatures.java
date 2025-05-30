class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int arr[]= new int[temp.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<temp.length;i++)
        {
            while(!s.isEmpty() && temp[i] > temp[s.peek()])
            {
                int prev = s.pop();
                arr[prev] = i - prev;
            }
            s.push(i);
        }
    return arr;
    }
}