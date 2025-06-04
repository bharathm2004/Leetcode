class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
        return  s;
        StringBuilder sb = new StringBuilder();
        char arr[][]= new char[numRows][s.length()];
        int ind=0;
        int row=0, col=0;
        boolean goingdown = true;
        while(ind < s.length())
        {
            arr[row][col]= s.charAt(ind++);
            if(row==0)
            {
                goingdown = true;
            }
            else if( row == numRows -1)
            {
                goingdown = false;
            }
            if(goingdown)
            {
                row++;
            }
            else
            {
                row--;
                col++;
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]!=0)
                {
                    sb.append(arr[i][j]);
                    count++;
                    if(count==s.length())
                    break;
                }
            }
        }
        return sb.toString();
    }
}