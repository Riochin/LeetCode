#
# @lc app=leetcode id=1261 lang=python
#
# [1261] Find Elements in a Contaminated Binary Tree
#

# @lc code=start
# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class FindElements(object):
    def __init__(self, root):
        """
        :type root: Optional[TreeNode]
        """
        if root is not None and root.val == -1:
            root.val = 0
        
        self.createTree(root)
        self.groot = root
        # rooot = root

        

    def find(self, target):
        """
        :type target: int
        :rtype: bool
        """
        return self.findNum(self.groot, target)
    
    def createTree(self, root):
        if root is None:
            return
        
        if root.left is not None:
            root.left.val = 2*root.val + 1
         
        
        if root.right is not None:
            root.right.val = 2*root.val + 2
        
        self.createTree(root.left)
        self.createTree(root.right)
    
    def findNum (self, root, target):
        if root is None:
            return False
        
        if root.val == target:
            return True
        
        return self.findNum(root.left, target) or self.findNum(root.right, target)
        

        


# Your FindElements object will be instantiated and called as such:
# obj = FindElements(root)
# param_1 = obj.find(target)
# @lc code=end

