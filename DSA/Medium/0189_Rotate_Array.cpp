/*
 * Problem: Rotate Array
 * LeetCode: 189
 * Difficulty: Medium
 * Topics: Array, Math, Two Pointers
 *
 * Description:
 * Given an array and k, rotate the array to the right by k positions in-place.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        if(nums.empty()) return;
        k = k%(nums.size());
        if(k==0) return;
        reverse(nums.begin(), nums.end());
        reverse(nums.begin(), nums.begin()+k);
        reverse(nums.begin()+k, nums.end());
    }
};
