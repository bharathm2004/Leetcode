class Solution {
    public int numSteps(String s) {
        // int num=0;
        // int place=0;
        // for(int i=s.length()-1;i>=0;i--)
        // {
        //     if(s.charAt(i)=='1')
        //     {
        //     num+=Math.pow(2,place);
        //     place++;
        //     }
        //     else
        //     {
        //         place++;
        //     }
        // }
        // return find(num);

        int carry = 0;
        int step = 0;
        for(int i=s.length()-1 ;i>0;i--)
        {
            int bit = s.charAt(i)-'0';
            int sum = bit + carry;
            if(sum % 2 != 0)
            {
                step+=2;
                carry = 1;
            }
            else{
                step+=1;
                carry = (sum==2) ? 1 : 0;
            }
        }
        return carry + step;




    }
    // public static int find(int n)
    // {
    //     int count=0;
    //     while(n!=1)
    //     {
    //         if(n%2!=0)
    //         {
    //             n+=1;
    //             count++;
    //         }
    //         else{
    //             n=n/2;
    //             count++;
    //         }
    //     }
    //     return count;
    // }
}