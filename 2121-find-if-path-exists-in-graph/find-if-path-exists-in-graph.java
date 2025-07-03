class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean visited[]= new boolean[n];
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                list.get(edges[i][0]).add(edges[i][1]);
                list.get(edges[i][1]).add(edges[i][0]);
            }
        }
        dfs(source,list,visited);
        return visited[destination];
    }
    public void dfs(int s , List<List<Integer>> list, boolean visited[])
    {
        visited[s]=true;
        for(int i : list.get(s))
        {
            if(!visited[i])
            dfs(i,list,visited);
        }
    }
}