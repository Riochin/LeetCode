#
# @lc app=leetcode id=1980 lang=python
#
# [1980] Find Unique Binary String
#

# @lc code=start
class Solution(object):
    def findDifferentBinaryString(self, nums):
        
        """
        :type nums: List[str]
        :rtype: str
        """

        n = len(nums)
        ans = []

        for i in range(0, n):
            if nums[i][i] == "0":
                ans.append("1")
            else :
                ans.append("0")

        return "".join(ans)
        
# @lc code=end

