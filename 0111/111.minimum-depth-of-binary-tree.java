/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. */
 
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        return calcDepth(root, 0);
        
    }

    public int calcDepth(TreeNode root, int depth){
        if(root == null){
            return Integer.MAX_VALUE;
        }

        if(root.left == null && root.right == null){
            return depth + 1;
        }

        return Math.min(calcDepth(root.left, depth + 1), calcDepth(root.right, depth + 1));
    }
}
// @lc code=end

