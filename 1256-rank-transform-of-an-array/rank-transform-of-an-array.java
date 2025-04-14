class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int res[]= new int[arr.length];
       for(int i=0;i<arr.length;i++)
       {
         res[i]=arr[i];
       }
       Arrays.sort(res);
       HashMap<Integer,Integer> map = new HashMap<>();
       int rank=1;
       for(int i=0;i<arr.length;i++)
       {
          if(!map.containsKey(res[i]))
          {
            map.put(res[i],rank);
            rank++;
          }
       }
       for(int i=0;i<arr.length;i++)
       {
          arr[i]=map.get(arr[i]);
       }
       return arr;

    }
}