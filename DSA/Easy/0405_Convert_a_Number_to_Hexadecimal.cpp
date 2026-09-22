/*
 * Problem: Convert a Number to Hexadecimal
 * LeetCode: 405
 * Difficulty: Easy
 * Topics: Math, Bit Manipulation
 *
 * Description:
 * Given a 32-bit integer, return its hexadecimal representation without leading zeroes.
 *
 * Time Complexity: O(log |n|)
 * Space Complexity: O(log |n|)
 */
class Solution {
public:
    string toHex(int num) {
        if(num==0) return "0";

        unsigned int n = num;
        string hexdigits = "0123456789abcdef";
        string result = "";

        while(n!=0){
            int remain = n%16;
            result += hexdigits[remain];
            n /= 16;
        }

        reverse(result.begin(), result.end());
        return result;
    }
};
