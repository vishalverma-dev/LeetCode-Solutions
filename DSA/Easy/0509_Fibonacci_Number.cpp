/*
 * Problem: Fibonacci Number
 * LeetCode: 509
 * Difficulty: Easy
 * Topics: Math, Dynamic Programming, Recursion, Memoization
 *
 * Description:
 * Given n, return the nth Fibonacci number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
public:
    int fib(int n) {
        int x = 0, y = 1;
        for(int i=0; i<n; i++){
            int z = x+y;
            x = y;
            y = z;
        }
        return x;
    }
};
