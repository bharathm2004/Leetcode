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
    public int sumNumbers(TreeNode root) {
        return find(root,0);
    }
    public static int find(TreeNode root,int value)
    {
        if(root==null)
        {
            return 0;
        }
        value=(value*10)+root.val;
        if(root.left== null && root.right==null)
        {
            return value;
        }
        return find(root.left,value)+find(root.right,value);
    }
}