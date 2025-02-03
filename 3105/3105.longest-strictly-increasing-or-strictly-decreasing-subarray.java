/*
 * @lc app=leetcode id=3105 lang=java
 *
 * [3105] Longest Strictly Increasing or Strictly Decreasing Subarray
 */

 //subarray : 部分配列

// @lc code=start
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int incrCount = 0;
        int decrCount = 0;
        int maxCount = 0;

        for(int i=1;i<n;i++){
            if(nums[i] > nums[i-1]){
                incrCount ++;
            } else {
                incrCount = 0;
            }

            if(nums[i] < nums[i-1] ){
                decrCount++;
            } else {
                decrCount = 0;
            }

            int temp = Math.max(decrCount, incrCount);
            maxCount = Math.max(maxCount, temp);
        }
        return maxCount+1;
        
    }
}
// @lc code=end

