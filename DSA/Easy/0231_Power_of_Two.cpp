/*
 * Problem: Power of Two
 * LeetCode: 231
 * Difficulty: Easy
 * Topics: Math, Bit Manipulation, Recursion
 *
 * Description:
 * Given an integer n, determine whether it is a power of two.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class Solution {
public:
    bool isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
    }
};
