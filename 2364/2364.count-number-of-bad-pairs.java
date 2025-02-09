/*
 * @lc app=leetcode id=2364 lang=java
 *
 * [2364] Count Number of Bad Pairs
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long goodCount = 0;
        long totalPairs = (long)nums.length * (nums.length-1) / 2; // nums.length をlongにし忘れないようにする

        for(int i=0;i<nums.length;i++){
            map.put(nums[i]-i, map.getOrDefault(nums[i]-i, 0) + 1); //count増やすので、当然+1を入れる！！
        }
        for(int value: map.values()){
            goodCount += (long)value * (value-1) /2;
        }

        return totalPairs - goodCount;
        
    }
}
// @lc code=end

