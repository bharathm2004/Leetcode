/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(root,targetSum,new ArrayList<>(),result);
        return result;
    }
    public void backtrack(TreeNode root, int targetSum, List<Integer> currentlist , List<List<Integer>> result)
    {
        if(root==null)
        {
            return;
        }
        currentlist.add(root.val);
        if(root.left== null && root.right==null && root.val==targetSum)
        {
            result.add(new ArrayList<>(currentlist));
        }
        else
        {
            backtrack(root.left,targetSum-root.val,currentlist,result);
            backtrack(root.right,targetSum-root.val,currentlist,result);
        }
        currentlist.remove(currentlist.size()-1);
    }

}