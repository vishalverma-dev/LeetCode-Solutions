/*
 * Problem: Palindrome Number
 * LeetCode: 9
 * Difficulty: Easy
 * Topics: Math
 *
 * Description:
 * Given an integer x, determine whether it reads the same forward and backward.
 *
 * Time Complexity: O(log |x|)
 * Space Complexity: O(log |x|)
 */
class Solution {
public:
    bool isPalindrome(int x) {
        string num = to_string(x);
        int start=0, end=num.length()-1;
        while(start<end){
            if(num[start]!=num[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
};
