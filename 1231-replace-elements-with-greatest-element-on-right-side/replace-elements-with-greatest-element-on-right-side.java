class Solution {
    public int[] replaceElements(int[] arr) {
        int l=arr.length;
        if(l==1)
        {
            arr[0]=-1;
            return arr;
        }
        int res[]= new int[l];
        res[l-1]=-1;
        for(int i=l-2;i>=0;i--)
        {
            res[i]=Math.max(res[i+1],arr[i+1]);
        }
        return res;
    }
}