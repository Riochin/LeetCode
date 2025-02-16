/*
 * @lc app=leetcode id=95 lang=java
 *
 * [95] Unique Binary Search Trees II
 */

// @lc code=start
/*
  Definition for a binary tree node.
  */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n == 0){
            return new ArrayList<>();
        }
        return generateTrees(1, n);
    }

    public List<TreeNode> generateTrees(int start, int end){
        List<TreeNode> allTrees = new ArrayList<>();
        if(start > end){
            allTrees.add(null);
            return allTrees;
        }

        for(int i=start; i<=end; i++){
            List<TreeNode> leftTrees = generateTrees(start, i-1);
            List<TreeNode> rightTrees = generateTrees(i+1, end);

            for(TreeNode left : leftTrees){
                for(TreeNode right : rightTrees){
                    TreeNode curremtTree = new TreeNode(i);
                    curremtTree.left = left;
                    curremtTree.right = right;
                    allTrees.add (curremtTree);
                }
            }
        }
        return allTrees;
    }
}
// @lc code=end

