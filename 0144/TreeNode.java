/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
 */

// @lc code=start

//Definition for a binary tree node.
import java.util.List;
import java.util.ArrayList;

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Traversal(root, result);

        return result;
    }

    public void Traversal(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        // if(root.left == null && root.right == null){
        //     return;
        // }

        result.add(root.val);

        Traversal(root.left, result);
        Traversal(root.right, result);

        // result.addAll(leftResult);
        // result.addAll(rightResult);

        return;
    }
}
// @lc code=end

