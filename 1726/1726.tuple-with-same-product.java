/*
 * @lc app=leetcode id=1726 lang=java
 *
 * [1726] Tuple with Same Product
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> productCount = new HashMap<>();
        int count = 0;

        // すべての (a, b) のペアを調べる
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                
                // すでに同じ積があれば、その回数をカウントに加える
                if (productCount.containsKey(product)) {
                    count += productCount.get(product);
                }

                // 積を HashMap に記録
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        // 1つの (a,b) につき (c,d) の組み合わせが count 回あるので、それぞれ 8 通りの並び方がある
        return count * 8;
    }
}

// @lc code=end

