/*
 * Problem: House Robber
 * LeetCode: 198
 * Difficulty: Medium
 * Topics: Array, Dynamic Programming
 *
 * Description:
 * Given values in adjacent houses, find the maximum amount that can be robbed without robbing adjacent houses.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int rob(int[] nums) {

        int one = 0, two = 0;

        for(int i=0; i<nums.length; i++){
            int best = Math.max(one, two + nums[i]);

            two = one;
            one = best;
            
        }

        return one;
    }
}
