/*
 * Problem: Reverse Linked List
 * LeetCode: 206
 * Difficulty: Easy
 * Topics: Linked List, Recursion
 *
 * Description:
 * Given the head of a singly linked list, reverse the list and return its new head.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* current = head;
        ListNode* prev = NULL;
        ListNode* next = NULL;
        while(current!=NULL){
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
};
