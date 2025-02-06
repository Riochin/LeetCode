/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

// @lc code=start
/**
  Definition for a binary tree node.
**/

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
          return true;
        }

        if(p == null || q == null ||p.val != q.val ){
          return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
// @lc code=end

