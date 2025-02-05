/*
 * @lc app=leetcode id=1800 lang=java
 *
 * [1800] Maximum Ascending Subarray Sum
 */

// @lc code=start
class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = 0;
        int maxSum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(i+1 < n && nums[i] >= nums[i+1] ){
                maxSum = Math.max(maxSum, sum);
                sum = 0;
            }

            if(i+1 == n){
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
// @lc code=end

