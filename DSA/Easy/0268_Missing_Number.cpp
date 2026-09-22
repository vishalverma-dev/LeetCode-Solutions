/*
 * Problem: Missing Number
 * LeetCode: 268
 * Difficulty: Easy
 * Topics: Array, Hash Table, Math, Binary Search, Bit Manipulation, Sorting
 *
 * Description:
 * Given n distinct values from the range 0 through n, return the single value missing from the array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        int sum = (n)*(n+1)/2;
        int array_Sum = 0;
        for(int i=0; i<n; i++){
            array_Sum += nums[i];
        }
        return sum-array_Sum;
    }
};
