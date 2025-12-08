/*
 * @lc app=leetcode id=1925 lang=java
 *
 * [1925] Count Square Sum Triples
 */

// @lc code=start
// 1925. Count Square Sum Triples
// 🔗 https://leetcode.com/problems/count-square-sum-triples/?envType=daily-question&envId=2025-12-08

// Time Complexity: O(N^2) ... N is n
// using double, the time to be more complicated

class Solution {
    public int countTriples(int n) {
        int res = 0;
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                double possible_c = Math.sqrt( i*i + j*j);
                // System.out.println(i+" "+j+" :" + possible_c);
                if(possible_c % 1.0 == 0 && possible_c <= n){
                    res+=2;
                } 
            }
        }
        return res;
    }
}
// @lc code=end

