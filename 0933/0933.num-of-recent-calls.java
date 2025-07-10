// 933. Number of Recent Calls
// https://leetcode.com/problems/number-of-recent-calls/description/?envType=study-plan-v2&envId=leetcode-75

// Time complexity: O(1)
// ↑ 実際には while ループが回ることもあるが、累積しても全体で O(N) に収まり、1回ごとの呼び出しでは O(1) と考えられる。
// Space complexity: O(N) <- N is the maximum num of pings within any 3000ms window

import java.util.*;

class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);

        while(!queue.isEmpty() && t - queue.peek() > 3000){
            queue.poll();
        }

        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */