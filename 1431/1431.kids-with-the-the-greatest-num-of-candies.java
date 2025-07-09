// 1431. Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75

/* キャンディーを持っている子供たちn人いて、キャンディーが与えられたとき、その子が一番キャンディを持ってたらtrueを追加 */

// Time Complexity: O(N) 83.75%
// Space complexity: O(N) 75.73%

import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        // 返すリスト 
        /* ‼️これを先に配列にしてからListにすると、メモリ効率良し */
        List<Boolean> res = new ArrayList<>();

        // 一番多いキャンディをメモ O(N)
        int max = 0;
        for(int candy: candies)max = Math.max(max, candy);

        // 足してみて、一番多いキャンディを超えたらtrue O(N)
        for(int candy: candies){
            if(candy + extraCandies >= max){
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}