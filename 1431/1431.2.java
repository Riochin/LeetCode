/* キャンディーを持っている子供たちn人いて、キャンディーが与えられたとき、その子が一番キャンディを持ってたらtrueを追加 */

// Time Complexity: O(N) 100%
// Space complexity: O(N) 56.35%

import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        // 返すリスト 
        /* 💡 これを先に配列にしてからListにし、メモリ効率Upしたかも？ */
        Boolean[] res = new Boolean[candies.length];

        // 一番多いキャンディをメモ O(N)
        int max = 0;
        // 💡 Math.maxではなくifで入れ替えたら、Runtime Beats 100%に
        for(int candy: candies){
            if(candy > max) max = candy;
        }

        // 足してみて、一番多いキャンディを超えたらtrue O(N)
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max){
                res[i] = true;
            } else {
                res[i] = false;
            }
        }
        return Arrays.asList(res);
    }
}
