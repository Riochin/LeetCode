/*
 * @lc app=leetcode id=1524 lang=java
 *
 * [1524] Number of Sub-arrays With Odd Sum
 */

// @lc code=start
class Solution {
    public int numOfSubarrays(int[] arr) {
        int res = 0;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        // boolean isOdd[] = new boolean[arr.length];
        int oddCount = 0;
        int evenCount = 1;
        long MOD = 1_000_000_007;

        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            if(prefix[i] % 2 == 1) {
                oddCount++;
                res += evenCount;
            } else {
                evenCount++;
                res += oddCount;
            }
            res = (int)((res + MOD) % MOD);  // 負の値を補正！

        }

        return res;

        // for(int i=0;i<arr.length;i++){
            
        //     if(arr[i]%2 == 1){
        //         isOdd[i] = true;
        //     }
        // }


    }
}
// @lc code=end

