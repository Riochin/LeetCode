/*
 * @lc app=leetcode id=1752 lang=java
 *
 * [1752] Check if Array Is Sorted and Rotated
 */

// @lc code=start
class Solution {
    public boolean check(int[] nums) {
        if(nums.length == 1){
            return true;
        }

        int[] nums2 = new int[nums.length * 2];
        for(int i=0;i<nums2.length;i++){
            nums2[i] = nums[i%nums.length];
            System.out.println("nums2[" + i +"]は" + nums2[i] );
        }


        int count = 0;
        for(int i=1;i<nums2.length;i++){
            if(nums2[i] >= nums2[i-1]){
                count++;
                System.out.println(nums2[i-1]+"<"+nums2[i] + "だったのでカウントを増やしました。（現在：" + count+ ")");
            } else {
                count =0;
                System.out.println(nums2[i-1]+"<"+nums2[i] + "ではなかったのでカウントをリセットしました。（現在：" + count+ ")");
            }

            if(count == nums.length -1){
                return true;
            }
        }

        return false;

    }
}
// @lc code=end

