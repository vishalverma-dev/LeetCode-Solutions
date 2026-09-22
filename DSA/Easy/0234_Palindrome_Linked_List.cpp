/*
 * Problem: Palindrome Linked List
 * LeetCode: 234
 * Difficulty: Easy
 * Topics: Linked List, Two Pointers, Stack, Recursion
 *
 * Description:
 * Given the head of a singly linked list, determine whether its values form a palindrome.
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
    bool isPalindrome(ListNode* head) {
        ListNode* slow = head;
        ListNode* fast = head;
        while(fast->next!=NULL && fast->next->next!=NULL){
            slow = slow->next;
            fast = fast->next->next;
        }

        ListNode* current = slow->next;
        ListNode* prev = NULL;
        while(current!=NULL){
            ListNode* next = current->next;
            current->next = prev;
            prev = current;
            current = next;
        }
        
        ListNode* start = head;
        ListNode* mid = prev;
        while(mid!=NULL){
            if(start->val != mid->val){
                return false;
            }
            start = start->next;
            mid = mid->next;
        }
        return true;
    }
};
