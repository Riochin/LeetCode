// 3. Longest Substring Without Repeating Characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/


import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] charArr = s.toCharArray();
        HashSet<Character> letters = new HashSet<>();
        int l = 0;

        int res = 0;

        for(int i=0;i<charArr.length;i++){
            while(letters.contains(charArr[i])){
                letters.remove(charArr[l]);
                l++;
            }
            letters.add(charArr[i]);
            res = Math.max(letters.size(), res);
        }

        return res;
    }
}