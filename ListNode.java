/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start

//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    // Deserialize method to convert a string to a ListNode
    public static ListNode deserialize(String data) {
        if (data == null || data.isEmpty() || data.equals("[]")) {
            return null;
        }
        // 入力文字列の先頭と末尾の角括弧を取り除く
        data = data.replaceAll("\\[|\\]", "");
        String[] values = data.split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (String value : values) {
            current.next = new ListNode(Integer.parseInt(value.trim()));
            current = current.next;
        }
        return dummy.next;
    }
}
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}

// @lc code=end