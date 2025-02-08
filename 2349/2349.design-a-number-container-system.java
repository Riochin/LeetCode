/*
 * @lc app=leetcode id=2349 lang=java
 *
 * [2349] Design a Number Container System
 */

// @lc code=start

import java.util.TreeMap;
import java.util.HashMap;
import java.util.TreeSet;

class NumberContainers {
    TreeMap<Integer, Integer> numContainer = new TreeMap<>();
    HashMap<Integer, TreeSet<Integer>> numberToIndices = new HashMap<>();

    public NumberContainers() {
    }

    public void change(int index, int number) {
        if (numContainer.containsKey(index)) {
            int oldNumber = numContainer.get(index);
            if (numberToIndices.containsKey(oldNumber)) {
                numberToIndices.get(oldNumber).remove(index);
                if (numberToIndices.get(oldNumber).isEmpty()) {
                    numberToIndices.remove(oldNumber);
                }
            }
        }

        numContainer.put(index, number);
        numberToIndices.putIfAbsent(number, new TreeSet<>());
        numberToIndices.get(number).add(index);
    }

    public int find(int number) {
        if (numberToIndices.containsKey(number) && !numberToIndices.get(number).isEmpty()) {
            return numberToIndices.get(number).first();
        }
        return -1;
    }
}


/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
// @lc code=end

