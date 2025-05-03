class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        if(rowIndex==0)
        {
            res.add(Arrays.asList(1));
            return res.get(0);
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);

        for(int i=1;i<=rowIndex;i++)
        {
            List<Integer> prev = res.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++)
            {
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            res.add(curr);
        }
        return res.get(rowIndex);
    }
}