/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
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

