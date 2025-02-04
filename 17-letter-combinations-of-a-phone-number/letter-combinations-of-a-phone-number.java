class Solution {
    private static final String Mapping[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
    public List<String> letterCombinations(String digit) {
        List<String> result = new ArrayList<>();
        if(digit==null || digit.length()==0)
        {
            return result;
        }
        backtrack(digit,0,new StringBuilder(),result);
        return result;
    }
    private void backtrack(String digit,int index,StringBuilder current,List<String> result)
    {
        if(index==digit.length()){
            result.add(current.toString());
            return;
        }
        String letters=Mapping[digit.charAt(index) - '0'];
        for(char c: letters.toCharArray())
        {
            current.append(c);
            backtrack(digit,index+1,current,result);
            current.deleteCharAt(current.length()-1);
        }
    }
}