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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
        {
            return list;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            int level = q.size();
            List<Integer> curr = new ArrayList<>();
            for(int i=0;i<level;i++)
            {
                TreeNode currNode = q.poll();
                curr.add(currNode.val);

                if(currNode.left!=null)
                q.offer(currNode.left);

                if(currNode.right!=null)
                {
                    q.offer(currNode.right);
                }
            }
            list.add(curr);
        }
        return list;
    }
}