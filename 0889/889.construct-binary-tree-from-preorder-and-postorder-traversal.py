#
# @lc app=leetcode id=889 lang=python
#
# [889] Construct Binary Tree from Preorder and Postorder Traversal
#

# @lc code=start
# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution(object):
    def constructFromPrePost(self, preorder, postorder):
        """
        :type preorder: List[int]
        :type postorder: List[int]
        :rtype: TreeNode
        """
        if not preorder or not postorder:
            return None
        
        root = TreeNode(preorder[0])
        if len(preorder) == 1:
            return root
        
        L = postorder.index(preorder[1]) + 1
        
        root.left = self.constructFromPrePost(preorder[1:L+1], postorder[:L])
        root.right = self.constructFromPrePost(preorder[L+1:], postorder[L:-1])
        
        return root
        
# @lc code=end

