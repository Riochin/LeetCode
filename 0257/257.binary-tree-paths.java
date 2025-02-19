/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        createPaths(root, "",res);
        return res;
        

    }

    public void createPaths(TreeNode root, String path, List<String> res){
        if(root != null){
            path += Integer.toString(root.val);
            if (root.left == null && root.right == null){
                res.add(path);
            } else {
                path += "->";  // extend the current path
                createPaths(root.left, path, res);
                createPaths(root.right, path, res);
            }
        }
    }
}
// @lc code=end

