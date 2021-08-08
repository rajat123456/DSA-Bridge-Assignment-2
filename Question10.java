// If Tree is Symmetric across its center
// Problem URL: https://leetcode.com/problems/symmetric-tree/submissions/

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
    public boolean isSymmetric(TreeNode root) {
        
        if(root==null)
            return true;

        return find(root.left, root.right );
        
    }
    
    static boolean find(TreeNode left, TreeNode right)
    {
        if(left==null && right==null)
            return true;
        
        if( (left!=null && right!=null) && (left.val==right.val))
            return (find(left.left, right.right) && find(left.right, right.left));
        
        return false;
    }
}
