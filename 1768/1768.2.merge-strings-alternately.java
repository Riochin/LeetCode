// 1768. Merge Strings Alternately

// resにひとつずつ繋げていく

// Time complexity: O(N)
// Space complexity: O(N)

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int n1 = word1.length();
        int n2 = word2.length();
        int len = Math.max(n1,n2);
        for(int i=0;i< len ; i++){
            if(word1.length() > i){
                res += word1.charAt(i);
            }

            if(word2.length() > i){
                res += word2.charAt(i);
            }
        }

        return res;
    }
}