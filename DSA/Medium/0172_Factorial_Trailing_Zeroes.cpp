/*
 * Problem: Factorial Trailing Zeroes
 * LeetCode: 172
 * Difficulty: Medium
 * Topics: Math
 *
 * Description:
 * Given n, return the number of trailing zeroes in n!.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class Solution {
public:
    int trailingZeroes(int n) {
        int count = 0;
        for(int i=5; n/i>0; i*=5){
            count += n/i;
        }
        return count;
    }
};
