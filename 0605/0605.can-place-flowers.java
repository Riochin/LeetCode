// 605. Can Place Flowers
// https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75

// Solution: 左右が空いてたらcount++ & bed[i] = 1!

// Time complexity: O(N) 97.42%
// Space complexity: O(1) 45.51%

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i=0 ; i<flowerbed.length ; i++){
            if(flowerbed[i] == 0){
                boolean emptyLeft = (i == 0 || flowerbed[i-1] == 0);
                boolean emptyRight = (i == flowerbed.length-1 || flowerbed[i+1] == 0);

                if(emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    count ++;
                }
            }
        }

        return count >= n;
    }
}