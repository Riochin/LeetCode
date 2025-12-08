/*
 * @lc app=leetcode id=1925 lang=java
 *
 * [1925] Count Square Sum Triples
 */

// @lc code=start
// 1925. Count Square Sum Triples
// 🔗 https://leetcode.com/problems/count-square-sum-triples/?envType=daily-question&envId=2025-12-08

// Time Complexity: O(N)

class Solution {
    public int countTriples(int n) {
        int res = 0;
        for(int u = 2; u * u <= n; u++){
            for(int v = 1; v < u; v++){
                // & 論理積...下位１ビットを取り出し
                if(((u-v) & 1) == 0 || gcd(u,v) != 1)continue; 
                int c = u * u + v*v;
                if(c > n) continue;

                res += (n/c) << 1; // << 1ビット左にずらす...2倍
            }
        }
        return res;
    }

    int gcd(int x, int y){
        return y == 0 ? x : gcd(y, x%y);
    }
}
// @lc code=end

