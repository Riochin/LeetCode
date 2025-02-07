/*
 * @lc app=leetcode id=3160 lang=java
 *
 * [3160] Find the Number of Distinct Colors Among the Balls
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> colors = new HashMap<>();
        HashMap<Integer, Integer> colorCount = new HashMap<>();
        int[] output = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            // 以前の色を削除
            if (colors.containsKey(ball)) {
                int oldColor = colors.get(ball);
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);
                if (colorCount.get(oldColor) == 0) {
                    colorCount.remove(oldColor);
                }
            }

            // 新しい色を追加
            colors.put(ball, color);
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);

            // 結果を保存
            output[i] = colorCount.size();
        }

        return output;
    }
}


// @lc code=end

