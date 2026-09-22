/*
 * Problem: Maximum Subarray
 * LeetCode: 53
 * Difficulty: Medium
 * Topics: Array, Divide and Conquer, Dynamic Programming
 *
 * Description:
 * Given an integer array, find the contiguous subarray with the largest sum and return that sum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i=1; i<nums.size(); i++){
            currentSum = max(nums[i], currentSum+nums[i]);
            maxSum = max(currentSum, maxSum);
        }
        return maxSum;
    }
};
