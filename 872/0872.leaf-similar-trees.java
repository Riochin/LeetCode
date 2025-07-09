// 872. Leaf-Similar Trees
// https://leetcode.com/problems/leaf-similar-trees/description/?envType=study-plan-v2&envId=leetcode-75

// 葉っぱが順番含め同じTreeですか？？

// Time complexity: O(N1 + N2)
// Space complexity: O(N1 + N2)

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafs1 = new ArrayList<>();
        List<Integer> leafs2 = new ArrayList<>();
        
        toLeafList(root1, leafs1);
        toLeafList(root2, leafs2);

        if(leafs1.size() != leafs2.size()) return false;
        // System.out.println("サイズは問題なし");

        for(int i=0;i<leafs1.size();i++){
            // 💡 Integerのキャッシュが働くのは -127 ~ 127まで。参照型はequalsで比較すること。
            if(!leafs1.get(i).equals(leafs2.get(i))) {
                // System.out.println("ちょ、まて〜い" + leafs1.get(i) + "," + leafs2.get(i));
                return false;
                }
           
        }

        return true;
    }

    public void toLeafList(TreeNode root, List<Integer> leafs){
        if(root == null) return;
        if(root.right == null && root.left == null){
            leafs.add(root.val);
            return;
        }

        toLeafList(root.left, leafs);
        toLeafList(root.right, leafs);

        return;
    }
}