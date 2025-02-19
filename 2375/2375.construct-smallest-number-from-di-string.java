/*
 * @lc app=leetcode id=2375 lang=java
 *
 * [2375] Construct Smallest Number From DI String
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        List<String> result = new ArrayList<>();
        List<String> stack = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            stack.add(Integer.toString(i + 1));  // 1 から 9 の数字を追加
            if (i == n || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.add(stack.remove(stack.size() - 1));  // D の塊を逆順で追加
                }
            }
        }

        return String.join("", result);
    }
}
// @lc code=end

