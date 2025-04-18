class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        for(int i=0;i<score.length;i++)
        {
            for(int j=i+1;j<score.length;j++)
            {
                if(score[i][k]<score[j][k])
                {
                    int temp = score[i][k];
                    score[i][k]=score[j][k];
                    score[j][k]=temp;
                    for(int c=0;c<score[0].length;c++)
                    {
                        if(c!=k)
                        {
                            int t=score[i][c];
                            score[i][c]=score[j][c];
                            score[j][c]=t;
                        }
                    }
                }
            }
        }
        return score;
    }
}