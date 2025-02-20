/*
 * @lc app=leetcode id=3160 lang=java
 *
 * [3160] Find the Number of Distinct Colors Among the Balls
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;

class Test {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> colors = new HashMap<Integer,Integer>(limit+1);
        int[] output = new int[queries.length];

        for(int i=0;i<limit+1;i++){
            colors.put(i, 0);
        }

        for(int i=0;i<queries.length;i++){
            colors.replace(queries[i][0], queries[i][1]);
            // int count = 0;
            // Setで一意な値を抽出
            int uniqueValueCount = new HashSet<>(colors.values()).size();
            if(colors.values().contains(0)){
                uniqueValueCount --;
            }
            // for(int j=0;j<limit+1;j++){
            //     if(colors.get(j) != 0){
            //         count++;
            //     }
            // }
            output[i] = uniqueValueCount;
        }

        return output;

    }
}
// @lc code=end

