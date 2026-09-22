/*
 * Problem: Reverse String
 * LeetCode: 344
 * Difficulty: Easy
 * Topics: Two Pointers, String
 *
 * Description:
 * Given an array of characters, reverse it in-place.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
public:
    void reverseString(vector<char>& s) {
        int start = 0, end = s.size()-1;
        while(start<end){
            swap(s[start], s[end]);
            start++;
            end--;
        }
    }
};
