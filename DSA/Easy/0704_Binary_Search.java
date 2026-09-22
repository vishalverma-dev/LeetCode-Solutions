/*
 * Problem: Binary Search
 * LeetCode: 704
 * Difficulty: Easy
 * Topics: Array, Binary Search
 *
 * Description:
 * Given a sorted integer array and a target, return the target index or -1 when it is absent.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class Solution {
    public int search(int[] nums, int target) {

        int left = 0, right = nums.length-1;
        
        while(left<=right){
            int mid = left+(right-left)/2;

            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                left = mid+1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
        }

        return -1;

    }
}
