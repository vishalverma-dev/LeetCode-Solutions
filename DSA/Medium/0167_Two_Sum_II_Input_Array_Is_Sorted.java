/*
 * Problem: Two Sum II - Input Array Is Sorted
 * LeetCode: 167
 * Difficulty: Medium
 * Topics: Array, Two Pointers, Binary Search
 *
 * Description:
 * Given a 1-indexed sorted integer array and a target, return the indices of two values that add to the target.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                return new int[] {left+1, right+1};
            }
            if(sum<target){
                left++;
            }else{
                right--;
            }
        }

        return new int[]{};
        
    }
}
