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
        int count=0,ele=-1;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ele;
    }
    public void inorder(TreeNode root,int k)
    {
        if(root!=null)
        {
            inorder(root.left,k);
            count++;
            if(count==k)
            {
                ele=root.val;
            }
            inorder(root.right,k);
        }
    } 
}