/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
 */

// @lc code=start
//Definition for a binary tree node.

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return searchPathSum(root, targetSum);
    }

    public boolean searchPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        return searchPathSum(root.left, targetSum - root.val) ||
         searchPathSum(root.right, targetSum - root.val);
    }
    
}
// @lc code=end

