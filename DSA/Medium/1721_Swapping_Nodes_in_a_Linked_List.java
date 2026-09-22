/*
 * Problem: Swapping Nodes in a Linked List
 * LeetCode: 1721
 * Difficulty: Medium
 * Topics: Linked List, Two Pointers
 *
 * Description:
 * Given a linked list and k, swap the values of the kth nodes from the beginning and end.
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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;
        for(int i=1; i<k; i++){
            first = first.next;
        }

        ListNode second = head;
        ListNode temp = first;
        while(temp.next!=null){
            temp = temp.next;
            second = second.next;
        }

        int v = first.val;
        first.val = second.val;
        second.val = v;

        return head;
        
    }
}
