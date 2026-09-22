/*
 * Problem: Running Sum of 1d Array
 * LeetCode: 1480
 * Difficulty: Easy
 * Topics: Array, Prefix Sum
 *
 * Description:
 * Given an integer array, return the array of cumulative sums.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public int[] runningSum(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        result[0] = nums[0];

        for(int i=1; i<n; i++){

            result[i] = result[i-1]+nums[i];

        }
        

        return result;
    }
}
