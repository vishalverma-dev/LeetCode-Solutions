/*
 * Problem: Maximum Average Subarray I
 * LeetCode: 643
 * Difficulty: Easy
 * Topics: Array, Sliding Window
 *
 * Description:
 * Given an integer array and k, find the contiguous subarray of length k with the maximum average.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {

    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for(int i=0; i<k; i++){
            windowSum += nums[i];
        }

        int maxSum = windowSum;
        for(int i=k; i<nums.length; i++){
            windowSum+=nums[i];
            windowSum-=nums[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum/k;
    }
}
