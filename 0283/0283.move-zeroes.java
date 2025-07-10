// 283. Move Zeroes
// https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75

// Time complexity: O(N)
// Space complexity: O(1)

/*
* <rに0以外、lに0を任せよう作戦>
* if(nums[r] != 0)
* ☝️ここ大事
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        for(int r = 0; r< nums.length;r++){
            if(nums[r] != 0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;

                l++;
            } 
        }
    }
}