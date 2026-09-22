/*
 * Problem: Sort Colors
 * LeetCode: 75
 * Difficulty: Medium
 * Topics: Array, Two Pointers, Sorting
 *
 * Description:
 * Given an array containing 0, 1, and 2, sort it in-place without using a library sort.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){

            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }

        }
    }
}
