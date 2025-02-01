/*
 * @lc app=leetcode id=3151 lang=java
 *
 * [3151] Special Array I
 */

// @lc code=start
class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;

        if(n < 2){
            return true;
        } else if(n == 2){
            return nums[0] % 2 != nums[1] % 2;
        }

        for(int i=1;i<n-1;i++){
            if(nums[i] % 2 != nums[i+1] % 2 && nums[i] % 2 != nums[i-1] % 2){
                continue;
            }
            return false;
        }
        return true;
    }
}
// @lc code=end

