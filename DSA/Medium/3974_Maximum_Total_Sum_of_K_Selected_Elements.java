/*
 * Problem: Maximum Total Sum of K Selected Elements
 * LeetCode: 3974
 * Difficulty: Medium
 * Topics: Array, Greedy, Sorting
 *
 * Description:
 * Given nums, k, and a decreasing multiplier, select and process k elements to maximize the total contribution.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(log n)
 */
class Solution {
    public long maxSum(int[] nums, int k, int mul) {

        Arrays.sort(nums);

        long maxTotalSum = 0;

        for(int i=nums.length-1; i>=nums.length-k; i--){

            long temp = nums[i];
            if(mul>0){
                maxTotalSum += (long)temp*mul;
            }else{
                maxTotalSum += temp;
            }

            mul--;

        }

        return maxTotalSum;
        
    }
}
