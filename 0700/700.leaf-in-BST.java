// 700. Search in a Binary Search Tree
// https://leetcode.com/problems/search-in-a-binary-search-tree/?envType=study-plan-v2&envId=leetcode-75

// Time complexity: O(N) 100%
// Space complexity: O(N) 12.13% (System.gc() で0.33%)

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;
        System.gc(); // 💡 これをつけると、実行時間と引き換えにMemory Beatsが上がる
        if(val < root.val){
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}