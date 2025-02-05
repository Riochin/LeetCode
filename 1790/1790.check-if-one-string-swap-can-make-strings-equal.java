/*
 * @lc app=leetcode id=1790 lang=java
 *
 * [1790] Check if One String Swap Can Make Strings Equal
 */

// @lc code=start
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }

        String[] a1 = s1.split("");
        String[] a2 = s2.split("");

        int i = 0;
        int dif = 0;
        int x = 0;
        int y = 0;

        while(i<a1.length && dif < 2){
            if(!(a1[i].equals(a2[i]))){
                // System.out.println("ifいった:"+i);
                if(x == 0){
                    x = i;
                } else {
                    y = i;
                }
                dif++;
            }
            i++;
        }

        String temp = a2[x];
        a2[x] = a2[y];
        a2[y] = temp;

        String newS2 = String.join("",a2);

        if(newS2.equals(s1)){
            return true;
        }

        // System.out.println(newS2 + s1);

        return false;
    }
}
// @lc code=end

