/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */

// @lc code=start

//Definition for a binary tree node.
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
    public boolean isBalanced(TreeNode root) {
        int leftHeight = 0;
        int rightHeight = 0;
        TreeNode current = root;
        if (root == null) {
            return true;
        }
        if(root.left != null){
            while(current != null) {
                System.out.println(current.val);
                System.out.println("左の高さは"+leftHeight);
                if(current.left != null) {
                    leftHeight++;
                    current = current.left;
                    continue;
                } else if(current.right != null) {
                    leftHeight++;
                    current = current.right;
                    continue;
                } else {
                    break;
                }
            }
        }
        
        

        current = root;
        if(root.right != null){
            while(current != null) {
                System.out.println(current.val);
                System.out.println("右の高さは"+rightHeight);
                if(current.right != null) {
                    rightHeight++;
                    current = current.right;
                    continue;
                } else if(current.left != null) {
                    rightHeight++;
                    current = current.left;
                    continue;
                } else {
                    break;
                }
            }
        }
        

        if(Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return true;
    }
}
// @lc code=end

