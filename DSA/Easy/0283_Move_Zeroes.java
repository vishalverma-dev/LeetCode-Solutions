/*
 * Problem: Move Zeroes
 * LeetCode: 283
 * Difficulty: Easy
 * Topics: Array, Two Pointers
 *
 * Description:
 * Given an integer array, move all zeroes to its end while preserving the relative order of non-zero elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public void moveZeroes(int[] nums) {

        int left = 0;

        for(int right=0; right<nums.length; right++){

            if(nums[right]!=0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
            }

        }

    }
}
