/*
 * Problem: Single Number III
 * LeetCode: 260
 * Difficulty: Medium
 * Topics: Array, Bit Manipulation
 *
 * Description:
 * Given an array where two values appear once and all others appear twice, return the two unique values.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int[] singleNumber(int[] nums) {

        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor ^= nums[i];
        }

        int mask = xor & -xor;
        int first = 0;
        int second = 0;

        for(int i=0; i<nums.length; i++){
            if ((nums[i] & mask) != 0){
                first ^= nums[i];
            }else{
                second ^= nums[i];
            }
        }

        return new int[] {first, second};
        
    }
}
