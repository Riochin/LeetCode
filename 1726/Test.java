/*
 * @lc app=leetcode id=1726 lang=java
 *
 * [1726] Tuple with Same Product
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Test {
    public int tupleSameProduct(int[] nums) {
        int a = nums[0];
        int n = nums.length;
        
        // int b = nums[1];
        // int c = nums[2];
        // int d = nums[3];

        int products[] = new int[n-1];
        ArrayList<Integer> samePros = new ArrayList<>();
        // int count = 0;

        for(int i=0;i<n-1;i++){
            if(nums[i+1] == a){
                return 0;
            }
            products[i] = a * nums[i+1];
            System.out.print(products[i] + " ");
        }
        
        // if(a == b || a == c || a == d || b == c || b == d || c == d){
        //     return 0;
        // }

        for(int i=1;i<n;i++){
            for(int j=i+i;i<n;i++){
                int c = nums[i];
                int d = nums[j];
                int cd = c * d;
                if(Arrays.stream(products).boxed().collect(Collectors.toList()).contains(cd) && c!=d){
                    System.out.println("配列内の" + cd + "が重なります");
                    samePros.add(cd);
                }
            }
        }

        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int aa = nums[i];
        //         int bb = nums[j];

        //         if(samePros.contains(aa * bb) && aa != bb){

        //         }
        //     }
        // }

        return samePros.size() * 8; 
    }
}
// @lc code=end

