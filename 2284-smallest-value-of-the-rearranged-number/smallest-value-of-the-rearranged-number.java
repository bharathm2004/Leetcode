class Solution {
    public long smallestNumber(long num) {
        boolean isNegative = num <0;
        char digits[] = Long.toString(Math.abs(num)).toCharArray();
        if(isNegative)
        {
            Arrays.sort(digits);
            reverse(digits);
        }
        else
        {
            Arrays.sort(digits);
            if(digits[0]=='0')
            {
                for(int i=1;i<digits.length;i++)
                {
                    if(digits[i]!='0')
                    {
                        char temp = digits[0];
                        digits[0]=digits[i];
                        digits[i]=temp;
                        break;
                    }
                }
            }
        }
        long res = Long.parseLong(new String(digits));
        return isNegative ? -res : res;
    }
    public static void reverse(char arr[])
    {
        int i=0,j=arr.length-1;
        while(i<j)
        {
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}