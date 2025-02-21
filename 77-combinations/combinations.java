class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        find(1,n,k,res,list);
        return res;
    }
    public static void find(int start,int n,int k,List<List<Integer>> res,List<Integer> list)
    {
        if(list.size()==k)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int num=start;num<=n;num++)
        {
        list.add(num);
        find(num+1,n,k,res,list);
        list.remove(list.size()-1);
        }
    }
}