/*
 * Problem: Valid Palindrome
 * LeetCode: 125
 * Difficulty: Easy
 * Topics: Two Pointers, String
 *
 * Description:
 * Given a string, determine whether its alphanumeric characters form a palindrome after ignoring case.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
bool palindromic(string exp){
    int start = 0, end = exp.size()-1;
    while(start<end){
        if(exp[start]!=exp[end]){
            return false;
        }
        start++;
        end--;
    }
    return true;
}

class Solution {
public:
    bool isPalindrome(string s) {
        string exp = "";
        for(char ch:s){
            if(isalnum(ch)){
                exp += tolower(ch);
            }
        }
        return palindromic(exp);
    }
};
