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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root,res,0);
        return res;
    }
    public void dfs(TreeNode root, List<Integer> res,int depth)
    {
        if(root==null)
        return;
        if(depth==res.size())
        {
            res.add(root.val);
        }
        else
        {
            res.set(depth,Math.max(res.get(depth),root.val));
        }
        dfs(root.left,res,depth+1);
        dfs(root.right,res,depth+1);

    }
}