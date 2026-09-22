/*
 * Problem: Linked List Cycle
 * LeetCode: 141
 * Difficulty: Easy
 * Topics: Hash Table, Linked List, Two Pointers
 *
 * Description:
 * Given the head of a linked list, determine whether the list contains a cycle.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
        }

        return false;

    }
}
