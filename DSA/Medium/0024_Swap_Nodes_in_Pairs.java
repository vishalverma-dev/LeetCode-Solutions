/*
 * Problem: Swap Nodes in Pairs
 * LeetCode: 24
 * Difficulty: Medium
 * Topics: Linked List, Recursion
 *
 * Description:
 * Given a linked list, swap every two adjacent nodes and return the modified head.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;


        while(prev.next!=null && prev.next.next!=null){

            ListNode first = prev.next;
            ListNode second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;
            prev = first;

        }

        return dummy.next;
        
    }
}
