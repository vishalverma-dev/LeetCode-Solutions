/*
 * Problem: Sqrt(x)
 * LeetCode: 69
 * Difficulty: Easy
 * Topics: Math, Binary Search
 *
 * Description:
 * Given a non-negative integer x, return the integer square root truncated toward zero.
 *
 * Time Complexity: O(log x)
 * Space Complexity: O(1)
 */
class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int res = 0;

        while (left<=right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid == x) {
                return mid;
            } 
            else if ((long) mid * mid < x) {
                res = mid;
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return res;
    }
}
