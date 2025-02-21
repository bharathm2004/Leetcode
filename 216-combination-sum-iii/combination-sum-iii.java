class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        find(1,k,n,list,res);
        return res;
    }
    public static void find(int start,int k,int n,List<Integer> list,List<List<Integer>> res)
    {
        if(list.size()==k)
        {
            int sum=0;
            for(int i : list)
            {
                sum+=i;
            }
            if(sum==n)
            {
                res.add(new ArrayList<>(list));
                return;
            }
        }
        for(int num=start;num<=9;num++)
        {
            list.add(num);
            find(num+1,k,n,list,res);
            list.remove(list.size()-1);
        }
    }
}