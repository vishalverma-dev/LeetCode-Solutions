/*
 * Problem: Remove Duplicates from Sorted Array
 * LeetCode: 26
 * Difficulty: Easy
 * Topics: Array, Two Pointers
 *
 * Description:
 * Given a sorted integer array, remove duplicates in-place so each distinct value appears once and return the count of unique values.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int removeDuplicates(int[] nums) {

        int left = 0;
        
        for(int right=1; right<nums.length; right++){
            if(nums[left]!=nums[right]){
                left++;
                nums[left] = nums[right];
            }
        }

        return left+1;
        
    }
}
