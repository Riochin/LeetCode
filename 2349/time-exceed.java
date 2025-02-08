/*
 * @lc app=leetcode id=2349 lang=java
 *
 * [2349] Design a Number Container System
 */

// @lc code=start

// import java.util.ArrayList;
// import java.util.HashMap;
import java.util.TreeMap;

class NumberContainers {
    TreeMap<Integer,Integer> numContainer = new TreeMap<Integer,Integer>();

    public NumberContainers() {
        
        // ArrayList<Integer> numContainer = new ArrayList<Integer>();
        
    }
    
    public void change(int index, int number) {
        if(this.numContainer.containsKey(index)){
            this.numContainer.replace(index, number);
            return;
        }

        this.numContainer.put(index, number);
        // System.out.println(index +"に"+number +"をおきました");
    }
    
    public int find(int number) {
        if(this.numContainer.containsValue(number)){
            for(int i: this.numContainer.keySet()){
                if(this.numContainer.get(i) == number){   
                    return i;
                }
            }
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

