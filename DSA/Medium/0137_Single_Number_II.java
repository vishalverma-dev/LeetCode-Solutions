/*
 * Problem: Single Number II
 * LeetCode: 137
 * Difficulty: Medium
 * Topics: Array, Bit Manipulation
 *
 * Description:
 * Given an array where every value appears three times except one, return the unique value.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int singleNumber(int[] nums) {

        int ones = 0;
        int twos = 0;

        for(int i=0; i<nums.length; i++){
            int num = nums[i];

            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        return ones;
        
    }
}
