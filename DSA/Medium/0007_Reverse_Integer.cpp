/*
 * Problem: Reverse Integer
 * LeetCode: 7
 * Difficulty: Medium
 * Topics: Math
 *
 * Description:
 * Given a signed 32-bit integer, return its digits reversed, or 0 if the result overflows the signed range.
 *
 * Time Complexity: O(log |x|)
 * Space Complexity: O(1)
 */
class Solution {
public:
    int reverse(int x) {
        long rev = 0;
        while(x){
            rev = rev*10 + x%10;
            x /= 10;
        }
        if(rev>INT_MAX || rev<INT_MIN) return 0;
        return int(rev);
    }
};
