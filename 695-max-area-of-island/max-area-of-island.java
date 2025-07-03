class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    //if we are passing area as paramter and changing in other function the value will not be updated because area is passed as value not reference
                    int area=dfs(grid,i,j);
                    max=Math.max(max,area);
                }
            }
        }
        return max;
    }
    public int dfs(int grid[][],int i,int j)
    {
        if(i<0 ||j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0)
        {
            return 0;
        }
        grid[i][j]=0;
        // 1 is added beacuse it is the current cell area
        return 1 + dfs(grid,i+1,j) + dfs(grid,i-1,j) + dfs(grid,i,j+1) + dfs(grid,i,j-1);
    }
}