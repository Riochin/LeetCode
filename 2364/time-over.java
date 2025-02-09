/*
 * @lc app=leetcode id=2364 lang=java
 *
 * [2364] Count Number of Bad Pairs
 */

// @lc code=start
class Solution {
    public long countBadPairs(int[] nums) {
        long count = 0;

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i] - nums[j] !=  i-j){
                    count++;
                }
            }
        }
        return count;

    }
}
// @lc code=end

