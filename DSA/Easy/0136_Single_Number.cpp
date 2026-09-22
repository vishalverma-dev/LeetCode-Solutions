/*
 * Problem: Single Number
 * LeetCode: 136
 * Difficulty: Easy
 * Topics: Array, Bit Manipulation
 *
 * Description:
 * Given an array where every value appears twice except one, return the value that appears once.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int unique = 0;
        for(int i=0; i< nums.size(); i++){
            unique ^= nums[i];
        }
        return unique;
    }
};
