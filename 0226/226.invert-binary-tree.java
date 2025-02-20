/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
 */

// @lc code=start
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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }

        TreeNode rootL = invertTree(root.left);
        TreeNode rootR = invertTree(root.right);

        TreeNode temp = rootL;
        rootL = rootR;
        rootR = temp;

        TreeNode res = new TreeNode();
        res.val = root.val;
        res.left = rootL;
        res.right = rootR;

        return res;
    }
}
// @lc code=end

