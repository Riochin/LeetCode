/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = Math.max(word1.length(),word2.length());
        int n = Math.min(word1.length(),word2.length());

        String longWord = word1.length() > word2.length() ? word1 : word2;
        String res = "";

        for(int i=0;i<n;i++){
            res += word1.charAt(i);
            res += word2.charAt(i);
        }

        for(int i=n;i<m;i++){
            if(word1.length() == word2.length())break;
            res += longWord.charAt(i);
        }

        return res;
    }
}
// @lc code=end

