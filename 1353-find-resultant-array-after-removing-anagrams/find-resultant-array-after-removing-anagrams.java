class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>(Arrays.asList(words));
        if(list.size()==1)
        return list;
        int ind=1;
        while(ind < list.size())
        {
            char a1[] = list.get(ind-1).toCharArray();
            char a2[] = list.get(ind).toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            if(Arrays.equals(a1,a2))
            {
                list.remove(ind);
            }
            else
            {
              ind++;
            }
        }
        return list;
    }
}