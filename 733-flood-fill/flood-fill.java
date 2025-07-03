class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int orginal = image[sr][sc];
        if(image[sr][sc]!=color)
        {
            dfs(image,color,sr,sc,orginal);
        }
        return image;
    }
    public void dfs(int image[][],int color,int i,int j,int og)
    {
        if(i<0 || j<0 || i>=image.length|| j>=image[0].length || image[i][j]!=og)
        {
            return;
        }
        image[i][j]=color;
        dfs(image,color,i+1,j,og); 
        dfs(image,color,i-1,j,og); 
        dfs(image,color,i,j+1,og); 
        dfs(image,color,i,j-1,og); 
    }
}